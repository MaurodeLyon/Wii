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

	Shape red = new Rectangle2D.Double(300, 0, 300, 300);
	Shape blue = new Rectangle2D.Double(300, 600, 300, 300);
	Shape green = new Rectangle2D.Double(0, 300, 300, 300);
	Shape yellow = new Rectangle2D.Double(600, 300, 300, 300);
	Shape cursor = new Rectangle2D.Double(0, 0, 0, 0);
	Color redColor = Color.RED;
	Color blueColor = Color.BLUE;
	Color greenColor = Color.GREEN;
	Color yellowColor = Color.YELLOW;
	Color cursorColor = Color.MAGENTA;
	Color backColor = Color.BLACK;

	public WiiMoteView() {
		setPreferredSize(new Dimension(900, 900));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(backColor);
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
