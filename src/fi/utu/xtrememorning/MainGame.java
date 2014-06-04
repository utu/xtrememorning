package fi.utu.xtrememorning;


public class MainGame
{
	public static void main(String[] args) {
		GameState state = new GameState();
		Cleaner cleaner = new Cleaner(state);
		Runtime.getRuntime().addShutdownHook(cleaner);
		
		View view = new TextView(state);
		view.RenderState();
	}
}

/**
 * Special shutdown hook thread, that gets initialized with the JVM, but runs only during
 * JVM shutdown. Cleans the runtime state.
 * @author sjtoik
 *
 */
class Cleaner extends Thread {
	GameState state = null;
    Cleaner(GameState state) {
        this.state = state;
    }

    public void run() {
    	this.state.close();
    }
}