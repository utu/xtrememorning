package fi.utu.xtrememorning;


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
		Player plr = state.getPlayers().get(0);
		Render("You are currently in " + plr.getRoom().description);
	}
}
