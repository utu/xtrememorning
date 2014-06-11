package fi.utu.xtrememorning;

import java.util.ArrayList;

public class Room {
	public int ID;
	public ArrayList<Door> doors = new ArrayList<Door>();
	public boolean isExit = false;
	public String description = "";
	
	@SuppressWarnings("unused")
	private Room() {
		// Nope
	}

	public Room(int ID) {
		this.ID = ID;
	}
}
