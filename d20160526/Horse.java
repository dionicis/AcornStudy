package d20160526;

import java.util.Random;

import javax.swing.JButton;

public class Horse extends Thread {
	JButton jbtn;

	public Horse(JButton jbtn) {
		this.jbtn = jbtn;
	}

	@Override
	public void run() {
		Random rnd = new Random();
		while (jbtn.getX() < 710) {
			int x = jbtn.getX();
			int y = jbtn.getY();
			x += rnd.nextInt(15);
			jbtn.setLocation(x, y);

			if (x > 700)
				x = 700;
			
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
