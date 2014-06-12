package fi.utu.xtrememorning;

public class Character implements ActionyThingy {

	public String name;
	public String race;
	public int hp;
	public int maxHp;
	public int exp;
	public String speciality;
	public Room room;

	private Character() {
		// Nope
	}

	public Character(String name, String race, int hp, int maxHp, int exp, String speciality, Room room) {
		this.name = name;
		this.race = race;
		this.hp = hp;
		this.maxHp = maxHp;
		this.exp = exp;
		this.speciality = speciality;
		this.room = room;
	}

	public class Hero extends Character {
		@SuppressWarnings("unused")
		private Hero() {
			// Nope
		}

		public Hero(String name, String race, int hp, int maxHp, int exp, String speciality, Room room) {
			super(name, race, hp, maxHp, exp, speciality, room);
		}
	}

	public class Villain extends Character {
		@SuppressWarnings("unused")
		private Villain() {
			// Nope
		}

		public Villain(String name, String race, int hp, int maxHp, int exp, String speciality, Room room) {
			super(name, race, hp, maxHp, exp, speciality, room);
		}
	}
}
