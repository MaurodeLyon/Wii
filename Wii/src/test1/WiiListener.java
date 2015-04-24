package test1;

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

public class WiiListener implements WiimoteListener {
	
	public void onButtonsEvent(WiimoteButtonsEvent arg0) {
		if(arg0.isButtonAJustPressed()){
			System.out.println("A");
		}
	}

	public void onClassicControllerInsertedEvent(ClassicControllerInsertedEvent arg0) {

	}

	public void onClassicControllerRemovedEvent(ClassicControllerRemovedEvent arg0) {

	}

	public void onDisconnectionEvent(DisconnectionEvent arg0) {

	}

	public void onExpansionEvent(ExpansionEvent arg0) {

	}

	public void onGuitarHeroInsertedEvent(GuitarHeroInsertedEvent arg0) {

	}

	public void onGuitarHeroRemovedEvent(GuitarHeroRemovedEvent arg0) {

	}

	public void onIrEvent(IREvent arg0) {

	}

	public void onMotionSensingEvent(MotionSensingEvent arg0) {

	}

	public void onNunchukInsertedEvent(NunchukInsertedEvent arg0) {

	}

	public void onNunchukRemovedEvent(NunchukRemovedEvent arg0) {

	}

	public void onStatusEvent(StatusEvent arg0) {

	}

}
