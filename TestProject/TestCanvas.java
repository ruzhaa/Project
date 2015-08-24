package TestGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class TestCanvas extends JPanel {
	public final int WIDTH = 600;
	public final int HEIGHT = 600;
	

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(new Color(255,228,225));

		Image img1 = Toolkit.getDefaultToolkit().getImage("maze.png");//mazeResult.png
		g.drawImage(img1, 139, 248, this);
		g.setFont(new Font("Tahoma", Font.PLAIN, 25));
		g.drawString("GAME drun drun drun...", 160, 30);
		g.setFont(new Font("Tahoma", Font.PLAIN, 17));
		g.drawString("END", 300, 590);
		Graphics2D g2 = (Graphics2D) g;
		g.setColor(Color.BLUE);
		g.drawString("o",240, 288 );
		g.drawString("b",320, 326 );
		g.drawString("j",300, 405);
		g.drawString("e",145, 400 );
		g.drawString("c",160, 485 );
		g.drawString("t",240, 530 );
		Ellipse2D circle = new Ellipse2D.Double(285, 250, 10, 10);
		g2.setPaint(Color.RED);
		g2.fill(circle);
		
	}

	public TestCanvas() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));

	}

}
