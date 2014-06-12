package fi.utu.xtrememorning;

public class Player {

	public String name;
	public String race;
	public int hp;
	public int maxHp;
	public int exp;
	public String speciality;
	public Room room;
	
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
