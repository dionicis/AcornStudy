package d20160526.HW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Hw1 extends JFrame implements ActionListener {
	JButton		imgBtn;
	JButton		jBtn;
	ImageIcon[]	imgIco;

	public Hw1(String title) {
		super(title);
		setLayout(null);

		jBtn = new JButton("·£ ´ý");
		jBtn.setBounds(250, 420, 300, 75);
		jBtn.addActionListener(this);
		add(jBtn);

		imgIco = new ImageIcon[4];
		for (int i = 0; i < 4; i++)
			imgIco[i] = new ImageIcon("src/d20160526/HW/Image/" + (i+1) + ".jpg");

		setBounds(100, 100, 800, 600);
		imgBtn = new JButton(imgIco[0]);
		imgBtn.setBounds(100, 30, 600, 350);
		add(imgBtn);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		Random rnd = new Random();
		if(obj.equals(jBtn))
			imgBtn.setIcon(imgIco[rnd.nextInt(4)]);
	}

	public static void main(String[] args) {
		new Hw1("·£´ý ÀÌ¹ÌÁö");
	}
}
