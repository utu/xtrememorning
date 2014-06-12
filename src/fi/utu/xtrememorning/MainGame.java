package fi.utu.xtrememorning;

import java.util.Scanner;

public class MainGame {
	public static void main(String[] args) {
		GameState state = new GameState();
		Cleaner cleaner = new Cleaner(state);
		Runtime.getRuntime().addShutdownHook(cleaner);
		View view = new TextView(state);
		Scanner textInput = new Scanner(System.in);
		System.out.println("Welcome to Xtreme Morning v0.1");
		System.out.println("Type 'q' or 'quit' to quit the game\n");

		try {
			while (true) {
				view.RenderState();
				String input = textInput.next();
				if (input.equals("q") || input.equals("quit")) {
					throw new ExceptionalException("User quit.");
				}
				view.ReceiveInput(input);
			}
		} catch (ExceptionalException e) {
			textInput.close();
			System.out.println("Game ended: " + e.getMessage());
			System.exit(0);
		}
		textInput.close();
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