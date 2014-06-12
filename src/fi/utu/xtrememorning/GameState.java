package fi.utu.xtrememorning;

import java.util.ArrayList;

public class GameState {
	ArrayList<Room> rooms = new ArrayList<Room>();
	ArrayList<Player> players = new ArrayList<Player>();
	GameData data = null;

	/**
	 * Wrapper class for game database objects.
	 */
	public GameState() {
		this.data = new GameData();

	}

	/**
	 * @return All doors in the game.
	 */
	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	/**
	 * There are three possible actions: door, item, hero. Go trough the door,
	 * use the item, attack a hero.
	 * 
	 * @param room
	 * @return
	 */
	public ArrayList<ActionyThingy> getActions(Room room) {
		ArrayList<ActionyThingy> actions = new ArrayList<ActionyThingy>();
		return actions;
	}
	
	public void execute(ActionyThingy obj) throws SuperpositionalQuantumException {
		
		if (obj instanceof Door) {
			// go trough
		} else if (obj instanceof Item) {
			// change ownership
		} else if (obj instanceof Player) {
			// attack the player
		}
	}

	public void close() {
		data.close();
	}

}
