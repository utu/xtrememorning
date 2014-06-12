package fi.utu.xtrememorning;

import java.util.ArrayList;

public class Room {
	public int ID = 0;
	public ArrayList<Door> doors = new ArrayList<Door>();
	public ArrayList<Item> items = new ArrayList<Item>();
	public ArrayList<Trap> traps = new ArrayList<Trap>();
	public String description = "";

	@SuppressWarnings("unused")
	private Room() {
		// Nope
	}

	public Room(int ID, ArrayList<Door> doors, ArrayList<Item> items, ArrayList<Trap> traps, String description) {
		this.ID = ID;
		this.doors = doors;
		this.items = items;
		this.traps = traps;
		this.description = description;
	}

	public boolean equals(Room room) {
		if (this.ID != 0 && room.ID != 0 && room.ID == this.ID) {
			return true;
		} else {
			return false;
		}
	}
}
