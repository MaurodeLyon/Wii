package sensorBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.Timer;

import wiiusej.values.IRSource;
import wiiusej.wiiusejevents.physicalevents.IREvent;
import wiiusej.wiiusejevents.physicalevents.MotionSensingEvent;

public class WiiMoteModel implements ActionListener {

	private WiiMoteView view;
	private IREvent IR;

	public WiiMoteModel(WiiMoteView view) {
		this.view = view;
		new Timer(1, this).start();
	}

	public void actionPerformed(ActionEvent e) {
		view.points.clear();
		if (IR != null) {
			IRSource[] points = IR.getIRPoints();
			for(int i = 0 ; i < points.length ; i++){
				view.points.add(new Rectangle2D.Double(points[i].getRx()-5, points[i].getRy()-5, 10, 10));
			}
		}
		view.repaint();
	
	}

	public void setView(IREvent e) {
		IR = e;
	}
}
