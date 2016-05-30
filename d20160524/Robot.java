package d20160524;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Robot extends Frame implements KeyListener {
	Button[]	btns;
	Button		enemy;

	public Robot(String title) {
		super(title);
		setLayout(null);
		setBounds(100, 50, 1000, 800);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		btns = new Button[6];
		btns[0] = new Button("^ ^");
		for (int i = 1; i < btns.length; i++)
			btns[i] = new Button();

		btns[0].setBounds(200, 140, 100, 50);
		btns[1].setBounds(115, 200, 75, 25);
		btns[2].setBounds(310, 200, 75, 25);
		btns[3].setBounds(200, 200, 100, 75);
		btns[4].setBounds(200, 280, 40, 75);
		btns[5].setBounds(260, 280, 40, 75);
		for (Button b : btns) {
			add(b);
			b.addKeyListener(this);
		}

		enemy = new Button("\\   /");
		enemy.setBounds(500, 300, 75, 150);
		add(enemy);

		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {

		int btnX = 0;
		int btnY = 0;
		int key = e.getKeyCode();

		if (key == 37)
			btnX -= 20;
		else if (key == 39)
			btnX += 20;
		else if (key == 38)
			btnY -= 20;
		else if (key == 40)
			btnY += 20;
		else if (key == 32) {
			int x = 0;
			for (int i = 0; i < 10; i++) {
				x += 4;
				int y = func2dim(x - 4, x);
				for (Button b : btns)
					b.setLocation(b.getX() + x, b.getY() - y);

				try {
					Thread.sleep(30);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			return;
		}

		else if (key == 88) {
			for (int i = 0; i < 100; i++) {
				int x = btns[2].getX();
				int y = btns[2].getY();
				double dis = (double) Math.sqrt(Math.pow(x - enemy.getX(), 2) + Math.pow(y - enemy.getY(), 2));

				if (dis < 150) {
					enemy.setLabel("¤Ð ¤Ð");
					enemy.setLocation(enemy.getX() + 250, enemy.getY() - 150);
				}

				if (i < 50)
					x += 4;
				else
					x -= 4;

				btns[2].setLocation(x, y);

				try {
					Thread.sleep(10);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			enemy.setLabel("\\   /");
			return;
		}

		for (Button b : btns)
			b.setLocation(b.getX() + btnX, b.getY() + btnY);

	}

	public int func2dim(int x1, int x2) {
		int result1 = (int) (-0.25 * x1 * (x1 - 40));
		int result2 = (int) (-0.25 * x2 * (x2 - 40));
		return result2 - result1;
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	public static void main(String[] args) {
		new Robot("Robot");
	}
}
