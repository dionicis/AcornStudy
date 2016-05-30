package d20160523;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class YesOrNo extends Frame implements WindowListener, MouseMotionListener {

	Label	lb;
	Button	btn1;
	Button	btn2;

	public YesOrNo(String title) {
		super(title);
		setBounds(200, 200, 800, 600);
		setLayout(null);
		lb = new Label("아무거나");
		lb.setBounds(350, 150, 400, 50);
		add(lb);
		btn1 = new Button("Yes");
		btn2 = new Button("No");
		btn1.setBounds(165, 400, 200, 50);
		btn2.setBounds(390, 400, 200, 50);
		add(btn1);
		add(btn2);

		this.addWindowListener(this);
		this.addMouseMotionListener(this);
		setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int bx = btn1.getX() + 75;
		int by = btn1.getY() + 25;

		System.out.println(bx + " " + by);

		int x = e.getX();
		int y = e.getY();

		double dis = Math.sqrt((x - bx) * (x - bx) + (y - by) * (y - by));
		System.out.println(dis);
		if (dis < 100) {
//			int rndX = (int) Math.random() * 600;
//			int rndY = (int) Math.random() * 100;
			int rndX = (int) Math.random() *20;
			int rndY = (int) Math.random() *20;
			btn1.setLocation(e.getX()+10, e.getY()+20);
		}
	}

	public static void main(String[] args) {
		new YesOrNo("YesOrNo");
	}

}
