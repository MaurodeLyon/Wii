package Simon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class mainPanel extends JPanel {

	private static final int WIDTH = 100;
	private static final int HEIGHT = 100;

	private Shape redRect,blueRect,yellowRect,greenRect,cursor;
	
	public mainPanel(){
		setSize(300,300);
	}

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;

		redRect 	= new Rectangle2D.Double(getWidth()/2-WIDTH/2,0						,WIDTH,HEIGHT);
		blueRect 	= new Rectangle2D.Double(getWidth()/2-WIDTH/2,getHeight()-HEIGHT	,WIDTH,HEIGHT);
		yellowRect 	= new Rectangle2D.Double(0					 ,getHeight()/2-HEIGHT/2,WIDTH,HEIGHT);
		greenRect 	= new Rectangle2D.Double(getWidth()-WIDTH	 ,getHeight()/2-HEIGHT/2,WIDTH,HEIGHT);
		cursor 		= new Rectangle2D.Double(getWidth()/2-WIDTH/2,getHeight()/2-HEIGHT/2,WIDTH,HEIGHT);
		
		g2.setColor(Color.BLACK);
		g2.fill(cursor);
		g2.setColor(Color.RED);
		g2.fill(redRect);
		g2.setColor(Color.BLUE);
		g2.fill(blueRect);
		g2.setColor(Color.YELLOW);
		g2.fill(yellowRect);
		g2.setColor(Color.GREEN);
		g2.fill(greenRect);
		System.out.println(getSize());
	}

}
