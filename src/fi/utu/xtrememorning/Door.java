package fi.utu.xtrememorning;

public class Door extends GameObject {
	String color;
	Room room1;
	Room room2;
	
	@SuppressWarnings("unused")
	private Door() {
		// Don't you dare initialize this
	}
	
	public Door(Room room1, Room room2) {
		this.room1 = room1;
		this.room2 = room2;
	}
	
	public boolean isExit() {
		if (room1 != null && room1.isExit)
			return true;
		if (room2 != null && room2.isExit)
			return true;
		
		return false;
	}
	
	public Room getRoom1() {return room1;}
	public Room getRoom2() {return room2;}
}
