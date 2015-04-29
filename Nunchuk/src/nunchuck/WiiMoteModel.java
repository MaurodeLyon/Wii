package nunchuck;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;

import javax.swing.Timer;

import wiiusej.values.RawAcceleration;

public class WiiMoteModel implements ActionListener {

	private WiiMoteView view;
	
	public WiiMoteModel(WiiMoteView view) {
		this.view = view;
		new Timer(200, this).start();
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}