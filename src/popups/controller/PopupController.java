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
			int count = 0;
			while (count<10)
			{
				
			display.displayMessage("I like dank maymays.");
			String answer = display.collectResponse("Type your question here");
			count++;
			}
		}
}
