package popups.controller;

import popups.view.PopupViewer;
import java.util.List;
import java.util.ArrayList;
import popups.model.Popups;
public class PopupController
{
		private PopupViewer display;
		private List <Popups> thingyList;
		public PopupController()
		{
			display = new PopupViewer();
			thingyList = new ArrayList<Popups>();
		}
		
		public void start()
		
		{
			learnLists();
			String answer ="dat boi";
			while(answer != null && !isDouble(answer))
			{
				answer = display.collectResponse("you need to type in a double!");
				
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
				display.displayMessage("That was not a  double XD");
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
	    private void learnLists()
	    {
	    	display.displayMessage("This is the size of the list" + thingyList.size());
	    	Popups firstThingy = new Popups();
	    	thingyList.add(firstThingy);
	    	display.displayMessage("This is the size of the list" + thingyList.size());
	    }
}

