package d20160525;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BigChance extends Frame {
	TextField[]	tfArr;
	Button		btn;

	public BigChance(String title) {
		super("title");
		setBounds(100, 100, 800, 600);
		setLayout(null);

		tfArr = new TextField[6];
		for (int i = 0; i < tfArr.length; i++) {
			tfArr[i] = new TextField();
			tfArr[i].setBounds(100 + i * 100, 200, 75, 125);
			add(tfArr[i]);
		}

		btn = new Button("인생은 한방!");
		btn.setBounds(150, 450, 500, 75);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Lotto lt = new Lotto();
				lt.makeNumber();
				int[] lotto = lt.getLotto();
				for (int i = 0; i < tfArr.length; i++)
					tfArr[i].setText(String.valueOf(lotto[i]));
				
			}
		});
		add(btn);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BigChance("대 박");
	}
}
