package simon;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Timer;

public class WiiMoteModel implements ActionListener {

	int x = 0;
	private WiiMoteView view;
	List<Integer> steps = new ArrayList<Integer>();
	List<Integer> input = new ArrayList<Integer>();
	int state = 0;
	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;
	Timer timer;
	boolean flip;

	public WiiMoteModel(WiiMoteView view) {
		this.view = view;
		new Timer(100, this).start();
	}

	public void actionPerformed(ActionEvent e) {
		if(state == 3)
		{
			if (up) {
			view.cursor = new Rectangle2D.Double(325, 25, 250, 250);
		}
		if (down) {
			view.cursor = new Rectangle2D.Double(325, 625, 250, 250);
		}
		if (left) {
			view.cursor = new Rectangle2D.Double(25, 325, 250, 250);
		}
		if (right) {
			view.cursor = new Rectangle2D.Double(625, 325, 250, 250);
		}}

		switch (state) {
		// pre game
		case 0:
			break;
		// list is correct
		case 1:
			steps.add((int) (Math.random() * 3));
			input.clear();
			state = 4;
			System.out.println("Steps are" + steps);
			break;
		// list is not correct
		case 2:
			steps.clear();
			input.clear();
			steps.add((int) (Math.random() * 3));
			state = 4;
			System.out.println("Steps are " + steps);
			break;
		// idle state
		case 3:
			break;
		// show sequence
		case 4:
			showsequence();
			state = 3;
			break;
		}
		// control lists
		if (steps.size() <= input.size()) {
			if (steps.size() == input.size()) {
				for (int i = 0; i < input.size(); i++) {
					if (!(input.get(i) == steps.get(i))) {
						state = 2;
					} else {
						state = 1;
					}
				}
			} else {
				state = 2;
			}
		}
		view.repaint();
	}

	private void showsequence() {
		x = 0;
		flip = false;
		timer = new Timer(500, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (x < steps.size()) {
					view.cursor = new Rectangle2D.Double(0, 0, 0, 0);
					switch (steps.get(x)) {
					case 0:
						view.cursor = new Rectangle2D.Double(325, 25, 250, 250);
						break;
					case 1:
						view.cursor = new Rectangle2D.Double(625, 325, 250, 250);
						break;
					case 2:
						view.cursor = new Rectangle2D.Double(325, 625, 250, 250);
						break;
					case 3:
						view.cursor = new Rectangle2D.Double(25, 325, 250, 250);
						break;
					}
					if (steps.size() >= 2 && x >= 1) {
						if (steps.get(x) == steps.get(x - 1)) {
							flip = !flip;
						}
					}
					if (flip) {
						view.cursorColor = Color.PINK;
					} else {
						view.cursorColor = Color.ORANGE;
					}
					x += 1;
				} else {
					x = 0;
					timer.stop();
					view.cursor = new Rectangle2D.Double(0, 0, 0, 0);
					view.cursorColor = Color.DARK_GRAY;
				}
			}
		});
		timer.start();
	}
}
