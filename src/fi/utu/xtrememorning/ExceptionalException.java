package fi.utu.xtrememorning;

/**
 * This is general way to notify, that game has ended. I can be either trap, exit
 * or user input.
 * @author sjtoik
 */
public class ExceptionalException extends Exception {
	public ExceptionalException(String string) {
		super(string);
	}

	private static final long serialVersionUID = -4388584787229225498L;
}
