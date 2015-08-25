package Game;

import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DrunDrun {

	private JFrame frame;
	private JTextField textBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrunDrun window = new DrunDrun();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DrunDrun() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// frame
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBackground(new Color(255, 192, 203));
		frame.setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						"D:\\Documents\\HackBulgaria\\Test\\Img\\ef282c4872e55b328a5535cdca0786eb.jpg"));
		frame.setAlwaysOnTop(true);
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setBounds(new Rectangle(0, 0, 1000, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("ZleSme");
		frame.setLocationRelativeTo(null);

		// panda
		JLabel panda = new JLabel("");
		panda.setBackground(new Color(238, 130, 238));
		Image pandaImg = new ImageIcon(this.getClass().getResource(
				"/panda-icon.png")).getImage();
		panda.setIcon(new ImageIcon(pandaImg));
		panda.doLayout();
		panda.setBounds(478, 213, 20, 20);
		frame.getContentPane().add(panda);

		// image-maze
		JLabel map = new JLabel("");
		map.setBackground(new Color(0, 0, 128));
		Image img = new ImageIcon(this.getClass().getResource(
				"/newMazeResult.png")).getImage();
		frame.getContentPane().setLayout(null);
		map.setIcon(new ImageIcon(img));
		map.setBounds(99, 213, 802, 322);
		frame.getContentPane().add(map);

		// button-start
		JButton start = new JButton("START");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		//		move(posoka);
			}
		});
		start.setBackground(new Color(255, 250, 205));
		start.setFont(new Font("DotumChe", Font.BOLD | Font.ITALIC, 17));
		start.setForeground(new Color(255, 0, 255));
		start.setBounds(420, 130, 160, 29);
		frame.getContentPane().add(start);

		// textBox-mnogo redove???
		textBox = new JTextField();
		textBox.setHorizontalAlignment(SwingConstants.CENTER);
		textBox.setEditable(false);
		textBox.setBackground(new Color(176, 224, 230));
		textBox.setForeground(new Color(0, 0, 128));
		textBox.setFont(new Font("SimSun-ExtB", Font.PLAIN, 17));
		textBox.setText(" tfghjhfksjf jfksdjf isjdf rjf dkjfvkl lkdfjvn kdfnv dnv kn v tfghjhfksjf jfksdjf isjdf rjf dkjfvkl lkdfjvn kdfnv dnv kn v tfghjhfksjf jfksdjf isjdf rjf dkjfvkl lkdfjvn kdfnv dnv kn v tfghjhfksjf jfksdjf isjdf rjf dkjfvkl lkdfjvn kdfnv dnv kn v");
		textBox.setBounds(44, 13, 512, 96);
		frame.getContentPane().add(textBox);
		textBox.setColumns(50);
	}
	 
	public void move(KeyEvent evn) {
		
	}
}
