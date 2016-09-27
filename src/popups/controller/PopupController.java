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
			while(!answer.equals(""))
			{
				
			display.displayMessage("I like dank maymays.");
			answer = display.collectResponse("Type your question here");
			display.displayMessage(answer);
			}
		}
}
