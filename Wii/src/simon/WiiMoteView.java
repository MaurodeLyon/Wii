package simon;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class WiiMoteView extends JPanel {

	Shape red, blue, green, yellow, cursor;
	Color redColor, blueColor, greenColor, yellowColor, cursorColor;

	public WiiMoteView() {
		setPreferredSize(new Dimension(900, 900));
		red = new Rectangle2D.Double(300, 0, 300, 300);
		blue = new Rectangle2D.Double(300, 600, 300, 300);
		green = new Rectangle2D.Double(0, 300, 300, 300);
		yellow = new Rectangle2D.Double(600, 300, 300, 300);
		cursor = new Rectangle2D.Double(-500, -500, 250, 250);
		redColor = Color.RED;
		blueColor = Color.BLUE;
		greenColor = Color.GREEN;
		yellowColor = Color.YELLOW;
		cursorColor = Color.MAGENTA;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, 900, 900);
		
		g2.setColor(redColor);
		g2.fill(red);
		g2.setColor(blueColor);
		g2.fill(blue);
		g2.setColor(greenColor);
		g2.fill(green);
		g2.setColor(yellowColor);
		g2.fill(yellow);
		g2.setColor(cursorColor);
		g2.fill(cursor);
	}
}