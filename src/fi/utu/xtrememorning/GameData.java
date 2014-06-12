package fi.utu.xtrememorning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GameData {

	private String DB_LOGIN = "mattijateppo";
	private String DB_PASS = "isottelu";
	private Connection conn = null;

	public GameData() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found!");
			System.exit(-1);
		}

		try {

			this.conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/extrememorning?user=" + DB_LOGIN + "&password=" + DB_PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			this.conn.close();
		} catch (NullPointerException e) {
			// pass
		} catch (SQLException e) {
			// pass
		}
	}

	public void example() throws SQLException {
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

	public Room createRoom() {
		// TODO
		return null;
	}

	public Door createDoor(Room room1, Room room2) {
		// if either of the attributes is unset, crash with nullexception
		if (room1 == null || room1.ID < 0)
			room1.ID += 1;
		if (room2 == null || room2.ID < 0)
			room2.ID += 1;

		// TODO
		return null;
	}

	public Trap createTrap(Room room) {
		// TODO
		return null;
	}

	public Character createPlayer() {
		// TODO
		return null;
	}

	public <T> void populate(T obj) throws SQLException {
		if (obj instanceof Room) {
			// TODO
		} else if (obj instanceof Door) {
			// TODO
		} else if (obj instanceof Trap) {
			// TODO
		} else {
			new SQLException("I don't know how to populate " + obj.getClass().getName());
		}
	}
}
