package d20160523;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuGuWin extends Frame implements ActionListener {
	Button		btn;
	TextField	txtField;
	Label		label;

	GuGuWin() {
		super("������");
		setBounds(150, 150, 500, 400);
		setLayout(null);
		btn = new Button("�� ��");
		add(btn);
		btn.setBounds(50, 300, 400, 50);
		btn.addActionListener(this);

		txtField = new TextField();
		txtField.setBounds(150, 150, 100, 50);
		txtField.setFont(new Font("GuFont", 0, 38));
		add(txtField);

		label = new Label("��", Label.CENTER);
		label.setBounds(300, 150, 50, 50);
		add(label);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (txtField.getText().isEmpty())
			System.out.println("�ؽ�Ʈ ���� ���ڸ� �Է��� �ּ���");
		else {
			int dan = Integer.parseInt(txtField.getText());
			for (int i = 1; i < 10; i++)
				System.out.println(dan + " * " + i + " = " + dan * i);
		}

		txtField.setText("");

	}

	public static void main(String[] args) {
		new GuGuWin();
	}
}
