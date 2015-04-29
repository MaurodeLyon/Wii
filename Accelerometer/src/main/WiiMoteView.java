package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Point2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class WiiMoteView extends JPanel {

	public Point2D X = new Point2D.Double(0, 0);
	public Point2D Y = new Point2D.Double(0, 0);
	public Point2D Z = new Point2D.Double(0, 0);
	
	public WiiMoteView() {
		setPreferredSize(new Dimension(900, 900));
	}

	public void paintComponent(Graphics g) {
		if(X.getX() == 0){super.paintComponent(g);}
		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(Color.RED);
		g2.fillRect((int)X.getX(),(int)X.getY(),3,3);
		g2.setColor(Color.BLUE);
		g2.fillRect((int)Y.getX(),(int)Y.getY(),3,3);
		g2.setColor(Color.GREEN);
		g2.fillRect((int)Z.getX(),(int)Z.getY(),3,3);
		g2.setColor(Color.BLACK);
		
		g2.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
	}
}
