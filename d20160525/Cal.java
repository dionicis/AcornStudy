package d20160525;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Cal extends Frame implements ActionListener {
	TextField	tf;
	Button[]	numBtn;
	Button[]	operBtn;
	String		oper;
	int			firstNum, secondNum;

	public Cal() {
		setTitle("계산기");
		setBounds(100, 100, 600, 600);
		setLayout(null);

		numBtn = new Button[11];

		for (int i = 0; i < numBtn.length; i++) {
			numBtn[i] = new Button();
			numBtn[i].addActionListener(this);
			add(numBtn[i]);
		}

		numBtn[0].setBounds(100, 150, 75, 75);
		numBtn[0].setLabel("7");
		numBtn[1].setBounds(200, 150, 75, 75);
		numBtn[1].setLabel("8");
		numBtn[2].setBounds(300, 150, 75, 75);
		numBtn[2].setLabel("9");
		numBtn[3].setBounds(100, 250, 75, 75);
		numBtn[3].setLabel("4");
		numBtn[4].setBounds(200, 250, 75, 75);
		numBtn[4].setLabel("5");
		numBtn[5].setBounds(300, 250, 75, 75);
		numBtn[5].setLabel("6");
		numBtn[6].setBounds(100, 350, 75, 75);
		numBtn[6].setLabel("1");
		numBtn[7].setBounds(200, 350, 75, 75);
		numBtn[7].setLabel("2");
		numBtn[8].setBounds(300, 350, 75, 75);
		numBtn[8].setLabel("3");
		numBtn[9].setBounds(100, 450, 75, 75);
		numBtn[9].setLabel("0");
		numBtn[10].setBounds(200, 450, 75, 75);
		numBtn[10].setLabel("00");

		operBtn = new Button[5];
		for (int i = 0; i < operBtn.length; i++) {
			operBtn[i] = new Button();
			operBtn[i].addActionListener(this);
			add(operBtn[i]);
		}
		operBtn[0].setBounds(400, 150, 75, 75);
		operBtn[0].setLabel("+");
		operBtn[1].setBounds(400, 250, 75, 75);
		operBtn[1].setLabel("-");
		operBtn[2].setBounds(400, 350, 75, 75);
		operBtn[2].setLabel("*");
		operBtn[3].setBounds(400, 450, 75, 75);
		operBtn[3].setLabel("/");
		operBtn[4].setBounds(300, 450, 75, 75);
		operBtn[4].setLabel("=");

		tf = new TextField();
		tf.setBounds(100, 75, 400, 50);
		add(tf);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String cmd = e.getActionCommand();
		if (obj == operBtn[0] || obj == operBtn[1] || obj == operBtn[2]
				|| obj == operBtn[3]) {// +
			// 지금까지 입력한 숫자가 계산을 위한 첫번째 숫자
			getFirstNumber(cmd);
		}
		else if (obj == operBtn[4]) {
			secondNum = Integer.parseInt(tf.getText().trim());
			int result = 0;
			switch (this.oper) {
				case "+":
					result = firstNum + secondNum;
					break;
				case "-":
					result = firstNum - secondNum;
					break;
				case "*":
					result = firstNum * secondNum;
					break;
				case "/":
					result = firstNum / secondNum;
					break;
			}
			tf.setText("" + result);

		}
		else {
			String data = tf.getText() + cmd;
			tf.setText(data);
		}
	}

	private void getFirstNumber(String cmd) {
		firstNum = Integer.parseInt(tf.getText().trim());
		tf.setText("");
		oper = cmd;
	}

	public static void main(String[] args) {
		new Cal();
	}
}
