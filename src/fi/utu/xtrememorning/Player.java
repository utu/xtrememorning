package fi.utu.xtrememorning;

public class Player implements ActionyThingy {

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
	
	public Player(String name, String race, int hp, int maxHp, int exp, String speciality, Room room) {
		this.name = name;
		this.race = race;
		this.hp = hp;
		this.maxHp = maxHp;
		this.exp = exp;
		this.speciality = speciality;
		this.room = room;
	}
	
	public String getName() {
		return "Player";
	}
}
