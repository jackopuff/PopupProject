package popups.controller;

import popups.view.PopupViewer;
public class PopupController
{
		private PopupViewer display;
		
		public PopupController()
		{
			display = new PopupViewer();
		}
		
		public void start()
		{
			String answer ="dat boi";
			while(answer != null && !answer.equals(""))
			{
				
			display.displayMessage("I like dank maymays.");
			answer = display.collectResponse("Type your question here");
			}
		}
		/**
		 * Checks a supplied String value to see if it can be converted
		 * into a double.
		 * @param potentialValue The supplied String.
		 * @return Whether the conversion was successful as a boolean value.
		 */
		private boolean isDouble(String potentialValue)
		{
		Boolean validDouble = false;
		try
		{
			double testValue = Double.parseDouble(potentialValue);
			validDouble = true;
		}
		catch(NumberFormatException notDoubleError)
		{
			display.displayMessage("That was nota  double XD");
		}
		return validDouble;
		}
}
