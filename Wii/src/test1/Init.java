package test1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Init {

	private JFrame mainFrame;
	private JPanel mainPanel;
	private WiiListener wiiListener;

	public Init() {
		initFrame();
		initPanel();
		initListener();
		mainFrame.add(mainPanel);
	}

	private void initListener() {
		wiiListener = new WiiListener();
	}

	private void initFrame() {
		mainFrame = new JFrame("Testapp");
		mainFrame.setSize(1024, 768);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}

	private void initPanel() {
		mainPanel = new JPanel();
	}
	
	public WiiListener getWiiListener(){
		return wiiListener;	
	}
}
