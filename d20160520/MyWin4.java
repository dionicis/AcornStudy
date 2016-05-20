package d20160520;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin4 extends Frame implements ActionListener {
	Button redBtn, blueBtn;

	public MyWin4() {
		setBounds(300, 300, 300, 300);
		redBtn = new Button("Red");
		blueBtn = new Button("Blue");
		setLayout(null);
		redBtn.setBounds(0, 200, 150, 100);
		blueBtn.setBounds(150, 200, 150, 100);

		redBtn.addActionListener(this);
		blueBtn.addActionListener(this);
		add(redBtn);
		add(blueBtn);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// String cmd = e.getActionCommand();
		/*
		 * if (cmd.equals("Red")) { this.setBackground(new Color(100, 200,
		 * 150)); System.out.println("»¡°­ ´©¸§"); } else if (cmd.equals("Blue")) {
		 * this.setBackground(Color.blue); System.out.println("ÆÄ¶û ´©¸§"); }
		 */
		if (e.getSource().equals(redBtn))
			setBackground(Color.red);
		else if (e.getSource().equals(blueBtn))
			setBackground(Color.blue);
	}

	public static void main(String[] args) {
		new MyWin4();
	}
}
