package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Accelerometer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		WiiMoteView view = new WiiMoteView();
		WiiMoteModel model = new WiiMoteModel(view);
		new WiiMoteController(view, model);

		frame.getContentPane().add(view);
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
}
