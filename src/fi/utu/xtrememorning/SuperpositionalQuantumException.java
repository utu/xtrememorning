package fi.utu.xtrememorning;

public class SuperpositionalQuantumException extends Exception {
	private static final long serialVersionUID = 2730491281877554892L;

	public SuperpositionalQuantumException(String msg) {
		super(msg);
	}
	
	public SuperpositionalQuantumException(ExceptionalException e) {
		super(e);
	}
}
