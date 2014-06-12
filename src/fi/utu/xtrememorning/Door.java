package fi.utu.xtrememorning;

public class Door implements ActionyThingy {
	public String color;
	private Room room1;
	private Room room2;
	public boolean isExit = false;

	@SuppressWarnings("unused")
	private Door() {
		// Don't you dare initialize this
	}

	public Door(Room room1, Room room2, boolean isExit) {
		this.room1 = room1;
		this.room2 = room2;
	}

	public Room getOtherRoom(Room room) throws ExceptionalException {
		if (this.isExit)
			throw new ExceptionalException("You found an exit!");

		if (room1.equals(room)) {
			return room2;
		} else if (room2.equals(room)) {
			return room1;
		}

		throw new NullPointerException("Hey, look at me when I'm talking to you, motherfucker. You died.");
	}

	public Room getRoom1() {
		return room1;
	}

	public Room getRoom2() {
		return room2;
	}
}
