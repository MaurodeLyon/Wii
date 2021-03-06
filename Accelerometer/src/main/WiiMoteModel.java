package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;

import javax.swing.Timer;

import wiiusej.values.RawAcceleration;

public class WiiMoteModel implements ActionListener {

	private WiiMoteView view;
	public RawAcceleration acceleration = new RawAcceleration();
	private int X, Y, Z;
	private int positionX;

	public WiiMoteModel(WiiMoteView view) {
		this.view = view;
		new Timer(5, this).start();
	}

	public void actionPerformed(ActionEvent e) {
		X = acceleration.getX();
		Y = acceleration.getY();
		Z = acceleration.getZ();
		//System.out.println(X + "\t" + Y + "\t" + Z);
		if (positionX > view.getWidth()) {
			positionX = 0;
		} else {
			positionX += 1;
		}
		view.X = new Point2D.Double(positionX, X - 126 + view.getHeight() / 2);
		view.Y = new Point2D.Double(positionX, Y - 127 + view.getHeight() / 2);
		view.Z = new Point2D.Double(positionX, Z - 153 + view.getHeight() / 2);
		
		view.repaint();
	}
}
