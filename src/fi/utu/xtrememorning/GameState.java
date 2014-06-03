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
	 * Return all doors in the given room.
	 * @param room
	 * @return
	 */
	public ArrayList<Door> getDoors(Room room) {
		return room.doors;
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
	
	public void close() {
		data.close();
	}
	
}
