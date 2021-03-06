package nunchuck;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class WiiMoteView extends JPanel {

	public Point2D stick = new Point2D.Double(20, 20);
	public double rotation = 0;

	public WiiMoteView() {
		setPreferredSize(new Dimension(1000, 1000));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.rotate(rotation, getWidth()/2, getHeight()/2);
		
		g2.setColor(Color.RED);

		g2.fillOval(((int) (stick.getX() + getWidth() / 2) - 10),((int) (stick.getY() + getHeight() / 2) - 10), 20, 20);
		String text = "(" + Math.round(stick.getX()) + "," + Math.round(stick.getY()) + ")";

		g2.drawString(text, ((int) (stick.getX() + getWidth() / 2) - 10) + 20,((int) (stick.getY() + getHeight() / 2) - 10));

		g2.setColor(Color.BLACK);
		g2.drawLine((int) (getWidth() * 0.2), getHeight() / 2, (int) (getWidth() * 0.8), getHeight() / 2);
		g2.drawLine(getWidth() / 2, (int) (getHeight() * 0.2), getWidth() / 2, (int) (getHeight() * 0.8));
		g2.drawOval(getWidth() / 2 - 150, getHeight() / 2 - 150, 300, 300);
	}
}
