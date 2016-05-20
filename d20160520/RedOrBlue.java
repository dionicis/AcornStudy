package d20160520;

import java.awt.Button;
import java.awt.Frame;

public class RedOrBlue extends Frame{
	Button btn1;
	Button btn2;
	public RedOrBlue() {
		super("Red Or Blue");
		setSize(500,300);
		setLocation(500,400);
		btn1 = new Button("Red");
		btn2 = new Button("Blue");
		add(btn1);
		add(btn2);
		setVisible(true);
	}
}
