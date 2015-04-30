package nunchuck;

import wiiusej.utils.JoystickEventPanel;
import wiiusej.wiiusejevents.physicalevents.ExpansionEvent;
import wiiusej.wiiusejevents.physicalevents.JoystickEvent;
import wiiusej.wiiusejevents.physicalevents.NunchukEvent;

public class NunchukJoystick extends JoystickEventPanel{

	private static final long serialVersionUID = -5804317625418867599L;

	public JoystickEvent getJoystickEvent(ExpansionEvent e) {
		if (e instanceof NunchukEvent) {
			return ((NunchukEvent) e).getNunchukJoystickEvent();
		}
		return null;
	}
}
