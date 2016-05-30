package d20160526.HW;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class RollingLotto2 extends Thread {
	JButton		btn;
	ImageIcon[]	imgIco;
	int			toPick;

	public RollingLotto2(JButton btn, ImageIcon[] imgIco, int toPick) {
		this.btn = btn;
		this.imgIco = imgIco;
		this.toPick = toPick;
	}

	@Override
	public void run() {
		Random rnd = new Random();
		for (int i = 0; i < 20; i++) {
			btn.setIcon(imgIco[rnd.nextInt(45)]);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		btn.setIcon(imgIco[toPick - 1]);
	}
}
