package TestGame;

import javax.swing.JFrame;

public class TestApp extends JFrame {
	public TestApp() {
		super.add(new TestCanvas());
		setResizable(false);
		pack();
		setTitle("My test GAME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	

}
