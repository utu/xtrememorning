package fi.utu.xtrememorning;


/**
 * A text-based view for rendering the GameState.
 */
public class TextView implements View
{
	private GameState state;
	
	public TextView(GameState state) {
		this.state = state;
	}
	
	public void RenderState() {
		System.out.println("Rendering GameState, hang on!");
	}
}
