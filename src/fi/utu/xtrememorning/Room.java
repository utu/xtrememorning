package fi.utu.xtrememorning;

import java.util.ArrayList;

public class Room extends GameObject {
	int huoneId;
	ArrayList<Door> doors = new ArrayList<Door>();
	ArrayList<Trap> traps = new ArrayList<Trap>();
	boolean isExit = false;
	
	@SuppressWarnings("unused")
	private Room() {
		// Nope
	}

	public Room(int id) {
		this.huoneId = id;
	}
	
	public ArrayList<Door> getDoors() {
		return doors;
	}
	
	public boolean isExit() {
		return isExit;
	}

}
