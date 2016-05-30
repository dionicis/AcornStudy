package d20160526;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Racing extends JFrame implements ActionListener {
	Horse		h1, h2, h3;
	JButton[]	horse;
	JButton		run;
	ImageIcon	img1, img2, img3;
	Canvas		line;

	public Racing() {
		setLayout(null);
		setBounds(100, 100, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		img1 = new ImageIcon("src/Image/bg.gif");
		img2 = new ImageIcon("src/Image/horse.gif");
		img3 = new ImageIcon("src/Image/horsestop.gif");

		horse = new JButton[3];
		for (int i = 0; i < horse.length; i++) {
			horse[i] = new JButton(img2);
			horse[i].setBounds(50, 125 + i * 100, 120, 60);
			add(horse[i]);
		}

		run = new JButton("RUN");
		run.setBounds(225, 475, 350, 50);
		run.addActionListener(this);
		add(run);

		line = new Canvas();
		line.setBounds(675, 100, 5, 325);
		line.setBackground(Color.gray);
		add(line);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(run)) {
			if (h1 == null) {//오버런 방지
				h1 = new Horse(horse[0]);
				h2 = new Horse(horse[1]);
				h3 = new Horse(horse[2]);
				h1.start();
				h2.start();
				h3.start();
			}
		}

		// 뛰는중에는 안눌림
	}

	public static void main(String[] args) {
		new Racing();
	}
}
