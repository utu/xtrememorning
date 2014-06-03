package fi.utu.xtrememorning;

import java.sql.SQLException;

public class GameObject {
	int populated = -1;
	
	public GameObject() {
		// Nada
	}
	
	public GameObject populate(GameData data) throws SQLException {
		data.populate(this);
		return this;
	}
}
