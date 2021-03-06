package main;

import wiiusej.WiiUseApiManager;
import wiiusej.Wiimote;
import wiiusej.values.RawAcceleration;
import wiiusej.wiiusejevents.physicalevents.ExpansionEvent;
import wiiusej.wiiusejevents.physicalevents.IREvent;
import wiiusej.wiiusejevents.physicalevents.MotionSensingEvent;
import wiiusej.wiiusejevents.physicalevents.WiimoteButtonsEvent;
import wiiusej.wiiusejevents.utils.WiimoteListener;
import wiiusej.wiiusejevents.wiiuseapievents.ClassicControllerInsertedEvent;
import wiiusej.wiiusejevents.wiiuseapievents.ClassicControllerRemovedEvent;
import wiiusej.wiiusejevents.wiiuseapievents.DisconnectionEvent;
import wiiusej.wiiusejevents.wiiuseapievents.GuitarHeroInsertedEvent;
import wiiusej.wiiusejevents.wiiuseapievents.GuitarHeroRemovedEvent;
import wiiusej.wiiusejevents.wiiuseapievents.NunchukInsertedEvent;
import wiiusej.wiiusejevents.wiiuseapievents.NunchukRemovedEvent;
import wiiusej.wiiusejevents.wiiuseapievents.StatusEvent;

public class WiiMoteController implements WiimoteListener {

	private WiiMoteModel model;
	private WiiMoteView view;
	private Wiimote[] wiimotes;
	private RawAcceleration acceleration;

	public WiiMoteController(WiiMoteView view, WiiMoteModel model) {
		this.model = model;
		this.view = view;
		connectWiiMotes();
	}

	private void connectWiiMotes() {
		wiimotes = WiiUseApiManager.getWiimotes(4, true);
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
			wiimote.addWiiMoteEventListeners(this);
			wiimote.activateMotionSensing();
		}
	}

	@Override
	public void onButtonsEvent(WiimoteButtonsEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClassicControllerInsertedEvent(
			ClassicControllerInsertedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClassicControllerRemovedEvent(
			ClassicControllerRemovedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDisconnectionEvent(DisconnectionEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onExpansionEvent(ExpansionEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onGuitarHeroInsertedEvent(GuitarHeroInsertedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onGuitarHeroRemovedEvent(GuitarHeroRemovedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onIrEvent(IREvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onMotionSensingEvent(MotionSensingEvent e) {
		// TODO Auto-generated method stub
		acceleration = e.getRawAcceleration();
		model.acceleration = acceleration;
	}

	@Override
	public void onNunchukInsertedEvent(NunchukInsertedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onNunchukRemovedEvent(NunchukRemovedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStatusEvent(StatusEvent arg0) {
		// TODO Auto-generated method stub

	}
}
