package Simon;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import wiiusej.Wiimote;

@SuppressWarnings("serial")
public class GUI extends JFrame{

	private mainPanel panel = new mainPanel();
	
	public GUI(Wiimote wiimote){
		super("Simon");
		
		setLayout(new BorderLayout());
		getContentPane().add(panel,BorderLayout.CENTER);
		setSize(panel.getWidth()+8,panel.getHeight()+37);
		setResizable(false);
	}	
}
