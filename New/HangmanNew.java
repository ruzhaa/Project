package hangman;

import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HangmanNew {

	private JFrame frame;

	private JLabel question;
	private JLabel answer;
	private JLabel pandichka;

//	private String[] targetWords = { "mama", "kuche", "java", "laptop",
//			"drundrun" };
//	private String currentGuess;
//	private String targetWord;
//
//	private int counter = 0; // broqch za pravilni dumi-smenq kartinkite
//
//	java.util.List alphaButtonList = new ArrayList();
//	Iterator alphaIterator = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HangmanNew window = new HangmanNew();
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
	public HangmanNew() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 240));
		frame.getContentPane().setLayout(null);

		JButton Q = new JButton("Q");
		Q.setEnabled(false);
		Q.setForeground(new Color(128, 0, 128));
		Q.setBackground(new Color(255, 228, 225));
		Q.setFont(new Font("Tahoma", Font.BOLD, 13));
		Q.setBounds(34, 365, 45, 34);
		frame.getContentPane().add(Q);

		JButton W = new JButton("W");
		W.setEnabled(false);
		W.setForeground(new Color(128, 0, 128));
		W.setBackground(new Color(255, 228, 225));
		W.setFont(new Font("Tahoma", Font.BOLD, 13));
		W.setBounds(88, 365, 47, 34);
		frame.getContentPane().add(W);

		JButton E = new JButton("E");
		E.setEnabled(false);
		E.setForeground(new Color(128, 0, 128));
		E.setBackground(new Color(255, 228, 225));
		E.setFont(new Font("Tahoma", Font.BOLD, 13));
		E.setBounds(144, 365, 45, 34);
		frame.getContentPane().add(E);

		JButton R = new JButton("R");
		R.setEnabled(false);
		R.setForeground(new Color(128, 0, 128));
		R.setBackground(new Color(255, 228, 225));
		R.setFont(new Font("Tahoma", Font.BOLD, 13));
		R.setBounds(198, 365, 45, 34);
		frame.getContentPane().add(R);

		JButton T = new JButton("T");
		T.setEnabled(false);
		T.setForeground(new Color(128, 0, 128));
		T.setBackground(new Color(255, 228, 225));
		T.setFont(new Font("Tahoma", Font.BOLD, 13));
		T.setBounds(254, 365, 45, 34);
		frame.getContentPane().add(T);

		JButton Y = new JButton("Y");
		Y.setEnabled(false);
		Y.setForeground(new Color(128, 0, 128));
		Y.setBackground(new Color(255, 228, 225));
		Y.setFont(new Font("Tahoma", Font.BOLD, 13));
		Y.setBounds(310, 365, 45, 34);
		frame.getContentPane().add(Y);

		JButton U = new JButton("U");
		U.setEnabled(false);
		U.setForeground(new Color(128, 0, 128));
		U.setBackground(new Color(255, 228, 225));
		U.setFont(new Font("Tahoma", Font.BOLD, 13));
		U.setBounds(366, 365, 45, 34);
		frame.getContentPane().add(U);

		JButton I = new JButton("I");
		I.setEnabled(false);
		I.setForeground(new Color(128, 0, 128));
		I.setBackground(new Color(255, 228, 225));
		I.setFont(new Font("Tahoma", Font.BOLD, 13));
		I.setBounds(422, 365, 45, 34);
		frame.getContentPane().add(I);

		JButton O = new JButton("O");
		O.setEnabled(false);
		O.setForeground(new Color(128, 0, 128));
		O.setBackground(new Color(255, 228, 225));
		O.setFont(new Font("Tahoma", Font.BOLD, 13));
		O.setBounds(478, 365, 45, 34);
		frame.getContentPane().add(O);

		JButton P = new JButton("P");
		P.setEnabled(false);
		P.setForeground(new Color(128, 0, 128));
		P.setBackground(new Color(255, 228, 225));
		P.setFont(new Font("Tahoma", Font.BOLD, 13));
		P.setBounds(534, 365, 45, 34);
		frame.getContentPane().add(P);

		JButton A = new JButton("A");
		A.setEnabled(false);
		A.setForeground(new Color(128, 0, 128));
		A.setBackground(new Color(255, 228, 225));
		A.setFont(new Font("Tahoma", Font.BOLD, 13));
		A.setBounds(66, 408, 45, 34);
		frame.getContentPane().add(A);

		JButton S = new JButton("S");
		S.setEnabled(false);
		S.setForeground(new Color(128, 0, 128));
		S.setBackground(new Color(255, 228, 225));
		S.setFont(new Font("Tahoma", Font.BOLD, 13));
		S.setBounds(122, 408, 45, 34);
		frame.getContentPane().add(S);

		JButton D = new JButton("D");
		D.setEnabled(false);
		D.setForeground(new Color(128, 0, 128));
		D.setBackground(new Color(255, 228, 225));
		D.setFont(new Font("Tahoma", Font.BOLD, 13));
		D.setBounds(178, 408, 45, 34);
		frame.getContentPane().add(D);

		JButton F = new JButton("F");
		F.setEnabled(false);
		F.setForeground(new Color(128, 0, 128));
		F.setBackground(new Color(255, 228, 225));
		F.setFont(new Font("Tahoma", Font.BOLD, 13));
		F.setBounds(234, 408, 45, 34);
		frame.getContentPane().add(F);

		JButton G = new JButton("G");
		G.setEnabled(false);
		G.setForeground(new Color(128, 0, 128));
		G.setBackground(new Color(255, 228, 225));
		G.setFont(new Font("Tahoma", Font.BOLD, 13));
		G.setBounds(290, 408, 45, 34);
		frame.getContentPane().add(G);

		JButton H = new JButton("H");
		H.setEnabled(false);
		H.setForeground(new Color(128, 0, 128));
		H.setBackground(new Color(255, 228, 225));
		H.setFont(new Font("Tahoma", Font.BOLD, 13));
		H.setBounds(346, 408, 45, 34);
		frame.getContentPane().add(H);

		JButton J = new JButton("J");
		J.setEnabled(false);
		J.setForeground(new Color(128, 0, 128));
		J.setBackground(new Color(255, 228, 225));
		J.setFont(new Font("Tahoma", Font.BOLD, 13));
		J.setBounds(402, 408, 45, 34);
		frame.getContentPane().add(J);

		JButton K = new JButton("K");
		K.setEnabled(false);
		K.setForeground(new Color(128, 0, 128));
		K.setBackground(new Color(255, 228, 225));
		K.setFont(new Font("Tahoma", Font.BOLD, 13));
		K.setBounds(458, 408, 45, 34);
		frame.getContentPane().add(K);

		JButton L = new JButton("L");
		L.setEnabled(false);
		L.setForeground(new Color(128, 0, 128));
		L.setBackground(new Color(255, 228, 225));
		L.setFont(new Font("Tahoma", Font.BOLD, 13));
		L.setBounds(514, 408, 45, 34);
		frame.getContentPane().add(L);

		JButton Z = new JButton("Z");
		Z.setEnabled(false);
		Z.setForeground(new Color(128, 0, 128));
		Z.setBackground(new Color(255, 228, 225));
		Z.setFont(new Font("Tahoma", Font.BOLD, 13));
		Z.setBounds(88, 451, 45, 34);
		frame.getContentPane().add(Z);

		JButton X = new JButton("X");
		X.setEnabled(false);
		X.setForeground(new Color(128, 0, 128));
		X.setBackground(new Color(255, 228, 225));
		X.setFont(new Font("Tahoma", Font.BOLD, 13));
		X.setBounds(144, 451, 45, 34);
		frame.getContentPane().add(X);

		JButton C = new JButton("C");
		C.setEnabled(false);
		C.setForeground(new Color(128, 0, 128));
		C.setBackground(new Color(255, 228, 225));
		C.setFont(new Font("Tahoma", Font.BOLD, 13));
		C.setBounds(200, 451, 45, 34);
		frame.getContentPane().add(C);

		JButton V = new JButton("V");
		V.setEnabled(false);
		V.setForeground(new Color(128, 0, 128));
		V.setBackground(new Color(255, 228, 225));
		V.setFont(new Font("Tahoma", Font.BOLD, 13));
		V.setBounds(256, 451, 45, 34);
		frame.getContentPane().add(V);

		JButton B = new JButton("B");
		B.setEnabled(false);
		B.setForeground(new Color(128, 0, 128));
		B.setBackground(new Color(255, 228, 225));
		B.setFont(new Font("Tahoma", Font.BOLD, 13));
		B.setBounds(312, 451, 45, 34);
		frame.getContentPane().add(B);

		JButton N = new JButton("N");
		N.setEnabled(false);
		N.setForeground(new Color(128, 0, 128));
		N.setBackground(new Color(255, 228, 225));
		N.setFont(new Font("Tahoma", Font.BOLD, 13));
		N.setBounds(368, 451, 45, 34);
		frame.getContentPane().add(N);

		JButton M = new JButton("M");
		M.setEnabled(false);
		M.setForeground(new Color(128, 0, 128));
		M.setBackground(new Color(255, 228, 225));
		M.setFont(new Font("Tahoma", Font.BOLD, 13));
		M.setBounds(424, 451, 45, 34);
		frame.getContentPane().add(M);

		JButton start_button = new JButton("START");
		start_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start_button.setText("NEW GAME");
				Q.setEnabled(true);
				W.setEnabled(true);
				E.setEnabled(true);
				R.setEnabled(true);
				T.setEnabled(true);
				Y.setEnabled(true);
				U.setEnabled(true);
				I.setEnabled(true);
				O.setEnabled(true);
				P.setEnabled(true);
				A.setEnabled(true);
				S.setEnabled(true);
				D.setEnabled(true);
				F.setEnabled(true);
				G.setEnabled(true);
				H.setEnabled(true);
				J.setEnabled(true);
				K.setEnabled(true);
				L.setEnabled(true);
				Z.setEnabled(true);
				X.setEnabled(true);
				C.setEnabled(true);
				V.setEnabled(true);
				B.setEnabled(true);
				N.setEnabled(true);
				M.setEnabled(true);
			}
		});
		start_button.setBackground(new Color(255, 240, 245));
		start_button.setForeground(new Color(128, 0, 128));
		start_button.setFont(new Font("Tahoma", Font.BOLD, 14));
		start_button.setBounds(1002, 39, 159, 85);
		frame.getContentPane().add(start_button);

		JButton exit_button = new JButton("EXIT");
		exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit_button.setBackground(new Color(255, 240, 245));
		exit_button.setForeground(new Color(128, 0, 128));
		exit_button.setFont(new Font("Tahoma", Font.BOLD, 14));
		exit_button.setBounds(1064, 496, 97, 42);
		frame.getContentPane().add(exit_button);

		question = new JLabel("tuk trqbva da prisustva vupros");
		question.setHorizontalAlignment(SwingConstants.CENTER);
		question.setForeground(new Color(0, 0, 0));
		question.setBackground(new Color(255, 255, 255));
		question.setBounds(75, 23, 428, 85);
		frame.getContentPane().add(question);

		answer = new JLabel(
				"tuk trqbva da sa kutiiki/ ?/ prazni mesta/ _ za populvane na bukvite");
		answer.setBackground(new Color(255, 255, 255));
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setBounds(75, 230, 428, 85);
		frame.getContentPane().add(answer);

		pandichka = new JLabel("");
		pandichka.setHorizontalAlignment(SwingConstants.CENTER);
		Image pandaImg = new ImageIcon(this.getClass().getResource(
				"/panda-happy.png")).getImage();
		pandichka.setIcon(new ImageIcon(pandaImg));
		pandichka.doLayout();
		pandichka.setBounds(649, 137, 377, 358);
		frame.getContentPane().add(pandichka);

		frame.getContentPane().add(pandichka);
		frame.setBackground(new Color(255, 192, 203));
		frame.setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						"D:\\Documents\\HackBulgaria\\Test\\Img\\ef282c4872e55b328a5535cdca0786eb.jpg"));
		frame.setAlwaysOnTop(true);
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setBounds(new Rectangle(0, 0, 1200, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("ZleSme");
		frame.setLocationRelativeTo(null);
	}

//	public void setUpNewGame() {
//		// izbor na duma
//		double numb = Math.random();
//		int next = (int) (numb * targetWords.length);
//		targetWord = targetWords[next];
//
//		// zapulvane na dumata
//		currentGuess = "@";
//		for (int i = 0; i < targetWord.length() - 1; i++) {
//			currentGuess = currentGuess.concat("@");
//			answer.setText(currentGuess);
//		}
//	}
//
//	public void processAnswer(String strAnswer) {
//		char newChar = strAnswer.charAt(0);
//		String nextGuess = "";
//		boolean found = false;
//
//		for (int i = 0; i < targetWord.length() - 1; i++) {
//			char temp = targetWord.charAt(i);
//			if (temp == newChar) {
//				nextGuess = nextGuess.concat(String.valueOf(newChar));
//				found = true;
//
//			} else {
//				nextGuess = nextGuess.concat(String.valueOf(currentGuess
//						.charAt(i)));
//			}
//
//			// za vseki simvol
//			currentGuess = nextGuess;
//			answer.setText(currentGuess);
//			counter++;
//		}
//
//		// gotovi funkcii za iterator-kato broqch
//
//		if (currentGuess.equals(targetWord)) {
//			Iterator alphaIterator = alphaButtonList.iterator();
//			while (alphaIterator.hasNext()) {
//				// -izkluchvane na bukvite
//				((JButton) alphaIterator.next()).setEnabled(false);
//				// -ima broqch za pravilnite dumi zapochvasht ot 0
//				// i pri pravilna duma ++ =>
//				switch (counter) {
//				case 1: {
//					Image pandaImg = new ImageIcon(this.getClass().getResource(
//							"/panda-1.png")).getImage();
//					pandichka.setIcon(new ImageIcon(pandaImg));
//					pandichka.doLayout();
//					pandichka.setBounds(649, 137, 377, 358);
//					frame.getContentPane().add(pandichka);
//					break;
//				}
//				case 2: {
//					Image pandaImg = new ImageIcon(this.getClass().getResource(
//							"/panda-2.png")).getImage();
//					pandichka.setIcon(new ImageIcon(pandaImg));
//					pandichka.doLayout();
//					pandichka.setBounds(649, 137, 377, 358);
//					frame.getContentPane().add(pandichka);
//					break;
//				}
//				case 3: {
//					Image pandaImg = new ImageIcon(this.getClass().getResource(
//							"/panda-3.png")).getImage();
//					pandichka.setIcon(new ImageIcon(pandaImg));
//					pandichka.doLayout();
//					pandichka.setBounds(649, 137, 377, 358);
//					frame.getContentPane().add(pandichka);
//					break;
//				}
//				case 4: {
//					Image pandaImg = new ImageIcon(this.getClass().getResource(
//							"/panda-4.png")).getImage();
//					pandichka.setIcon(new ImageIcon(pandaImg));
//					pandichka.doLayout();
//					pandichka.setBounds(649, 137, 377, 358);
//					frame.getContentPane().add(pandichka);
//					break;
//				}
//				case 5: {
//					Image pandaImg = new ImageIcon(this.getClass().getResource(
//							"/panda-5.png")).getImage();
//					pandichka.setIcon(new ImageIcon(pandaImg));
//					pandichka.doLayout();
//					pandichka.setBounds(649, 137, 377, 358);
//					frame.getContentPane().add(pandichka);
//					break;
//				}
//				case 6: {
//					Image pandaImg = new ImageIcon(this.getClass().getResource(
//							"/panda-6.png")).getImage();
//					pandichka.setIcon(new ImageIcon(pandaImg));
//					pandichka.doLayout();
//					pandichka.setBounds(649, 137, 377, 358);
//					frame.getContentPane().add(pandichka);
//					break;
//				}
//				case 7: {
//					Image pandaImg = new ImageIcon(this.getClass().getResource(
//							"/panda-7.png")).getImage();
//					pandichka.setIcon(new ImageIcon(pandaImg));
//					pandichka.doLayout();
//					pandichka.setBounds(649, 137, 377, 358);
//					frame.getContentPane().add(pandichka);
//					break;
//				}
//				case 8: {
//					Image pandaImg = new ImageIcon(this.getClass().getResource(
//							"/panda-8.png")).getImage();
//					pandichka.setIcon(new ImageIcon(pandaImg));
//					pandichka.doLayout();
//					pandichka.setBounds(649, 137, 377, 358);
//					frame.getContentPane().add(pandichka);
//					break;
//				}
//				case 9: {
//					Image pandaImg = new ImageIcon(this.getClass().getResource(
//							"/panda-9.png")).getImage();
//					pandichka.setIcon(new ImageIcon(pandaImg));
//					pandichka.doLayout();
//					pandichka.setBounds(649, 137, 377, 358);
//					frame.getContentPane().add(pandichka);
//					break;
//				}
//				case 10: {
//					Image pandaImg = new ImageIcon(this.getClass().getResource(
//							"/panda-10.png")).getImage();
//					pandichka.setIcon(new ImageIcon(pandaImg));
//					pandichka.doLayout();
//					pandichka.setBounds(649, 137, 377, 358);
//					frame.getContentPane().add(pandichka);
//					break;
//				}
//				}
//				// logikata???
//			}
//		} else {
//			Image pandaImg = new ImageIcon(this.getClass().getResource(
//					"/panda-cry.png")).getImage();
//			pandichka.setIcon(new ImageIcon(pandaImg));
//			pandichka.doLayout();
//			pandichka.setBounds(649, 137, 377, 358);
//			frame.getContentPane().add(pandichka);
//		}
//
//	}
}
