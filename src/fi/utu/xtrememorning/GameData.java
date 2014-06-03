package fi.utu.xtrememorning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GameData {

	private String DB_LOGIN = "mattijateppo";
	private String DB_PASS  = "isottelu";
	private Connection conn = null;
	
	public GameData() {
		try {
			Class.forName("org.mysql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Ajuria ei löydy!");
		}

		try {
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost/xtrememorning", DB_LOGIN, DB_PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			// pass
		}
	}
	
	public void test() throws SQLException {
		String kys = "SELECT Ano, Animi FROM Asiakas " + "WHERE Paikka = 'Salo';";
		Statement stmt = conn.createStatement();
		ResultSet res = stmt.executeQuery(kys);
		while (res.next()) {
			int no = res.getInt(1);
			String nimi = res.getString(2);
			System.out.println(no + " " + nimi);
		}
		res.close();
		conn.close();
	}
}
