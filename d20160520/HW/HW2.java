package d20160520.HW;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HW2 extends Frame implements ActionListener {
	Button	btn;
	boolean	run;

	HW2() {
		super("·£´ý Ä®¶ó");
		setBounds(300, 300, 300, 300);
		setLayout(null);
		btn = new Button("¹öÆ°");
		btn.setBounds(125, 125, 50, 50);
		btn.addActionListener(this);
		add(btn);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int r = (int) (Math.random() * 255);
		int g = (int) (Math.random() * 255);
		int b = (int) (Math.random() * 255);
		this.setBackground(new Color(r, g, b));
	}

	public static void main(String[] args) {
		new HW2();

	}
}
