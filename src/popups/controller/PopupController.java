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
			display.displayMessage("i like dank maymays");
		}
}
