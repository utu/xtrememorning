package fi.utu.xtrememorning;


/**
 * The interface for all views.
 */
public interface View
{
	void RenderState() throws ExceptionalException;
	void ReceiveInput(String input);
}
