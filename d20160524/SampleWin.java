package d20160524;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SampleWin extends Frame {

	public SampleWin() {

		setBounds(100, 100, 800, 600);

		// window Ã¢ Á¾·á
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new SampleWin();
	}
}
