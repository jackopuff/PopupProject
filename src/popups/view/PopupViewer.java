package popups.view;

import javax.swing.JOptionPane;

/**
 * Popup display class with three methods for GUI.
 * @author Jackson Carter
 * @version September 27, 2016
 */
public class PopupViewer
{
    /**
     * creates a popup message to show the user a String
     * @param message The String to show the user.
     * 
     */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
		
	}
	
	/**
	 * Creates a popup to as a question to the uer. Stores the response
	 * as a string.
	 * @param question The question supplied to the user.
	 * @return The users response as a string.
	 */
	public String collectResponse(String question)
	{
		String response = "";
		response =JOptionPane.showInputDialog(null,question);
		return response;
	}
	/**
	 * Creates a popup to prompt the user to choose yes/no/cancel
	 * to a upplied question.
	 * @param question The question being asked.
	 * @return The JOptionPane constant value for yes/no/cancel.
	 */
	public int collectOption(String question)
	{
		int optionNumber = 0;
		optionNumber= JOptionPane.showConfirmDialog(null, question);
		return optionNumber;
	}
}
