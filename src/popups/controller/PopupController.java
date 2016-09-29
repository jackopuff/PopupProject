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
		 * @return Whether the conversion was successful (true/false).
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
		
		/**
		 * Checks supplied String value to see if it can be converted
		 * into an integer. If it can't, a popup is displayed.
		 * @param potentialValue The supplied String.
		 * @return Whether the conversion was successful (true/false).
		 */
		
		private boolean isInteger(String potentialValue)
		{
			boolean validInteger = false;
			try
			{
				int testValue = Integer.parseInt(potentialValue);
				validInteger = true;
			}
			catch(NumberFormatException notIntegerError)
			{
				display.displayMessage(notIntegerError.getMessage());
				display.displayMessage("you need an int");
			}
			
			return validInteger;
		}
}
