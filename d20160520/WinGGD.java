package d20160520;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinGGD extends Frame {
	Button btn;
	
	WinGGD(int input) {
		super("������");
		setSize(500, 300);
		setLocation(400, 500);
		btn = new Button(input+"�� ���");
		Handler1 hd1 = new Handler1(input);
		btn.addActionListener(hd1);
		add(btn);
		setVisible(true);
		
	}
}

class Handler1 implements ActionListener {
	int input;
	Handler1(int input){
		this.input = input;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 1; i < 10; i++)
			System.out.println(input + " * " + i + " = " + input * i);
		System.out.println("�������� �����մϴ�.");
		System.exit(0);
	}

}