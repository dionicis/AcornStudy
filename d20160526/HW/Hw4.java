package d20160526.HW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Hw4 extends JFrame implements ActionListener, Runnable {
	JButton[]		lottoBtn;
	JButton			btn;
	ImageIcon[]		imgIco;
	RollingLotto2[]	rl;
	int[]			order;

	public Hw4(String title) {
		super(title);
		setBounds(100, 100, 800, 600);
		setLayout(null);

		order = new int[6];

		lottoBtn = new JButton[6];
		for (int i = 0; i < lottoBtn.length; i++) {
			lottoBtn[i] = new JButton();
			lottoBtn[i].setBounds(100 + i * 100, 200, 75, 125);
			add(lottoBtn[i]);
		}

		btn = new JButton("인생은 한방!");
		btn.setBounds(150, 450, 500, 75);
		btn.addActionListener(this);
		add(btn);

		imgIco = new ImageIcon[45];
		for (int i = 0; i < imgIco.length; i++)
			imgIco[i] = new ImageIcon("src/d20160526/HW/Image/lottoImage/ball" + (i + 1) + ".png");

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btn)) {
			Lotto lt = new Lotto();
			lt.makeNumber();
			int[] lotto = lt.getLotto();

			Random rnd = new Random();
			for (int i = 0; i < order.length; i++) {
				order[i] = rnd.nextInt(6);
				for (int j = 0; j < i; j++)
					if (order[i] == order[j])
						i--;
			}

			rl = new RollingLotto2[lotto.length];
			for (int i = 0; i < rl.length; i++)
				rl[i] = new RollingLotto2(lottoBtn[i], imgIco, lotto[i]);

			Thread th = new Thread(this);
			th.start();
		}
	}

	public static void main(String[] args) {
		new Hw4("대 박");
	}

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			rl[order[i]].start();
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
}
