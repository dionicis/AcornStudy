package d20160520.HW;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class HW1 extends Frame {
	Button[] btn;
	HW1() {
		super("숫자버튼");
//		setSize(400, 300);
//		setLocation(400, 300);
		setBounds(400,300,450,350);

		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		
		btn = new Button[50];
		for (int i = 0; i < 50; i++) {
			btn[i] = new Button((i + 1) + "번째");
			add(btn[i]);
		}
		setVisible(true);

	}
	
	public static void main(String[] args) {
		HW1 hw = new HW1();
	}
}
