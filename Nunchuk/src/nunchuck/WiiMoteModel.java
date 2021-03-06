package nunchuck;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;

import javax.swing.Timer;

import wiiusej.wiiusejevents.physicalevents.MotionSensingEvent;

public class WiiMoteModel implements ActionListener {

	private WiiMoteView view;
	public Point2D joyStick = new Point2D.Double(0, 0);
	private float angle;
	private float magnitude;
	public MotionSensingEvent motion;

	public WiiMoteModel(WiiMoteView view) {
		this.view = view;
		new Timer(1, this).start();
	}

	public void actionPerformed(ActionEvent e) {
		// X
		//System.out.println(Math.sin(Math.toRadians(angle)));
		// Y
		//System.out.println(-1*Math.cos(Math.toRadians(angle)));
		
		view.stick = new Point2D.Double(Math.sin(Math.toRadians(angle))*(magnitude * 150),(-1*Math.cos(Math.toRadians(angle))*(magnitude*150)));
		view.repaint();
	}

	public void setAngle(float angle) {
		this.angle = angle;
	}

	public void setMagnitude(float magnitude) {
		this.magnitude = magnitude;
	}
}
