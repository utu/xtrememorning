package fi.utu.xtrememorning;

import java.util.ArrayList;

public class Room {
	int ID;
	ArrayList<Door> doors = new ArrayList<Door>();
	ArrayList<Trap> traps = new ArrayList<Trap>();
	boolean isExit = false;
	
	@SuppressWarnings("unused")
	private Room() {
		// Nope
	}

	public Room(int ID) {
		this.ID = ID;
	}
	
	public ArrayList<Door> getDoors() {
		return doors;
	}
	
	public boolean isExit() {
		return isExit;
	}

}
