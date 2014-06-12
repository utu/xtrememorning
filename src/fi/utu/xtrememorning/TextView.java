package fi.utu.xtrememorning;

import java.util.ArrayList;


/**
 * A text-based view for rendering the GameState.
 */
public class TextView implements View
{
	private GameState state;
	
	private void Render(String text) {
		System.out.println(text);
	}
	
	public TextView(GameState state) {
		this.state = state;
	}
	
	public void RenderState() throws ExceptionalException {
		ArrayList<Player> plrs = state.getPlayers();
		if (plrs.size() == 0) {
			Render("No player found!");
			return;
		}
		Player plr = plrs.get(0);
		Room room = plr.getRoom();
		if (room == null) {
			Render("You are currently in the void!");
		}
		else {
			Render("You are currently in " + room.description);
			Render("The room contains the following items:");
			ArrayList<Item> items = room.items;
			for (int i = 0; i < items.size(); ++i) {
				Render(" - " + items.get(i).description);
			}
		}
	}
	
	public void ReceiveInput(String input) {
	}
}
