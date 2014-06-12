package fi.utu.xtrememorning;

import java.util.ArrayList;


/**
 * A text-based view for rendering the GameState.
 */
public class TextView implements View
{
	private GameState state;
	private ArrayList<ActionyThingy> actions;
	
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
		Room room = plr.room;
		if (room == null) {
			Render("You are currently in the void!");
		}
		else {
			Render("You are currently in " + room.description);
			Render("\nThe room contains the following items:");
			for (Item item: room.items) {
				Render(" - " + item.description);
			}
			Render("\nYou have the following actions:");
			actions = state.getActions(room);
			for (int i = 0; i < actions.size(); ++i) {
				Render((new Integer(i)).toString() + ") " + actions.get(i).getName());
			}
		}
	}
	
	public void ReceiveInput(String input) {
		if (actions == null) {
			Render("No actions available!");
			return;
		}
		int index = (int)Integer.getInteger(input);
		Render("Action " + index + " selected.");
		try {
			state.execute(actions.get(index));
		}
		catch (SuperpositionalQuantumException spqe) {
			// TODO
		}
	}
}
