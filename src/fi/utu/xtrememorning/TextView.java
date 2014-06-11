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
	
	public void RenderState() {
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
			Render("You are currently in " + plr.getRoom().description);
		}
	}
}
