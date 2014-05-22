package fi.utu.xtrememorning;

import java.util.ArrayList;

public class GameState {
	ArrayList<Door> doors = new ArrayList<Door>();
	ArrayList<Room> rooms = new ArrayList<Room>();
	ArrayList<Player> players = new ArrayList<Player>();
	
	public GameState(GameData data) {
		
	}
	
	/**
	 * Return all doors in the given room.
	 * @param room
	 * @return
	 */
	public ArrayList<Door> getDoors(Room room) {
		return doors;
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
	
	
	
}
