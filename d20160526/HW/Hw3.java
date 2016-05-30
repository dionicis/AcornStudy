package d20160526.HW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Hw3 extends JFrame implements ActionListener {
	JButton[]		lottoBtn;
	JButton			btn;
	ImageIcon[]		imgIco;
	RollingLotto[]	rl;

	public Hw3(String title) {
		super(title);
		setBounds(100, 100, 800, 600);
		setLayout(null);

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

			rl = new RollingLotto[lotto.length];
			for (int i = 0; i < rl.length; i++){
				rl[i] = new RollingLotto(lottoBtn[i], imgIco, lotto[i]);
				rl[i].start();
			}
		}
	}

	public static void main(String[] args) {
		new Hw3("대 박");
	}
}
