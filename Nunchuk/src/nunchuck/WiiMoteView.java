package nunchuck;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Point2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class WiiMoteView extends JPanel {

	private Point2D stick = new Point2D.Double(20,20);

	public WiiMoteView() {
		setPreferredSize(new Dimension(900, 900));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.RED);
		g2.fillOval((int) stick.getX() - 10, (int) stick.getY() - 10, 20, 20);
		g2.setColor(Color.BLACK);
		g2.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
		g2.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
		g2.drawOval(getWidth() / 4, getHeight() / 4, getWidth() / 2, getHeight() / 2);
	}
}