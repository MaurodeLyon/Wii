package test1;

import wiiusej.WiiUseApiManager;
import wiiusej.Wiimote;

public class Test1 {

	public static void main(String[] args) {
		Wiimote[] wiimotes = WiiUseApiManager.getWiimotes(4, true);
		Init init = new Init();
		for (int id = 0; id < wiimotes.length; id++) {
			Wiimote wiimote = wiimotes[id];
			switch (id) {
			case 0:
				wiimote.setLeds(true, false, false, false);
				break;
			case 1:
				wiimote.setLeds(false, true, false, false);
				break;
			case 2:
				wiimote.setLeds(false, false, true, false);
				break;
			case 3:
				wiimote.setLeds(false, false, false, true);
				break;
			}
			wiimote.addWiiMoteEventListeners(init.getWiiListener());
		}
	}
}