package fi.utu.xtrememorning;

public class MainGame {
	public static void main(String[] args) {
		GameState state = new GameState();
		Cleaner cleaner = new Cleaner(state);
		Runtime.getRuntime().addShutdownHook(cleaner);

		try {
			View view = new TextView(state);
			view.RenderState();
		} catch (ExceptionalException e) {
			System.out.println("Game ended: " + e.getMessage());
			System.exit(0);
		}
	}
}

/**
 * Special shutdown hook thread, that gets initialized with the JVM, but runs
 * only during JVM shutdown. Cleans the runtime state and saves stuff, if
 * needed. Hooks are called in random order, so there is a possibility, that
 * database connection has already been shut down.
 * 
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