package fi.utu.xtrememorning;

import java.sql.SQLException;
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
	public ArrayList<String> getActions(Room room) {
		ArrayList<String> actions = new ArrayList<String>();
		return actions;
	}
	
	public void populate(ActionyThingy obj) throws SQLException {
		
	}

	public void close() {
		data.close();
	}

}
