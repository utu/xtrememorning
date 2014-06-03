package fi.utu.xtrememorning;

public class Door {
	String color;
	Room behind;
	
	Door(Room room) {
		this.behind = room;
	}
	
	public boolean isExit() {
		return this.behind.isExit();
	}
}
