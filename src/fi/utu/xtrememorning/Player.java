package fi.utu.xtrememorning;

public class Player {

	private String name;
	private Room room;
	
	@SuppressWarnings("unused")
	private Player() {
		// Nope
	}
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {return name;}
	public Room getRoom() {return room;}
	public void setRoom(Room room) {this.room = room;}
}
