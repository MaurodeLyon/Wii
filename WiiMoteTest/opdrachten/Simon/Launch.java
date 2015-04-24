package Simon;

import wiiusej.WiiUseApiManager;
import wiiusej.Wiimote;
import wiiusej.test.WiiuseJGuiTest;

public class Launch {

	public static void main(String[] args){
		Wiimote[] wiimotes = WiiUseApiManager.getWiimotes(1, true);
		GUI gui = null;
		if (wiimotes.length > 0) {
			gui = new GUI(wiimotes[0]);
		} else {
			System.out.println("no connection");
		}
		gui.setDefaultCloseOperation(WiiuseJGuiTest.EXIT_ON_CLOSE);
		gui.setVisible(true);
	}
}
