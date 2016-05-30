package d20160527.HW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CopyToFile extends JFrame implements ActionListener {
	JTextField	srcTf;
	JTextField	dstTf;
	JButton		copyBtn;
	JButton		exitBtn;
	JButton		srcBtn;
	JButton		dstBtn;

	public CopyToFile(String title) {
		super(title);
		setLayout(null);
		setBounds(100, 100, 600, 500);

		srcTf = new JTextField();
		dstTf = new JTextField();

		srcTf.setBounds(250, 90, 200, 25);
		dstTf.setBounds(250, 160, 200, 25);

		add(srcTf);
		add(dstTf);

		srcBtn = new JButton("Source");
		dstBtn = new JButton("Dest");
		copyBtn = new JButton("복사");
		exitBtn = new JButton("종료");
		srcBtn.setBounds(150, 75, 75, 50);
		dstBtn.setBounds(150, 150, 75, 50);
		copyBtn.setBounds(150, 250, 125, 50);
		exitBtn.setBounds(325, 250, 125, 50);
		srcBtn.addActionListener(this);
		dstBtn.addActionListener(this);
		copyBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		add(srcBtn);
		add(dstBtn);
		add(copyBtn);
		add(exitBtn);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == srcBtn || obj == dstBtn) {
			JFileChooser jfc = new JFileChooser("c:/");
			int val = jfc.showOpenDialog(this);
			if (val == 0) {
				if (obj == srcBtn)
					srcTf.setText(jfc.getSelectedFile().getAbsolutePath());
				else
					dstTf.setText(jfc.getSelectedFile().getAbsolutePath());
			}
		}

		else if (obj == copyBtn) {
			String srcTxt = srcTf.getText();
			String dstTxt = dstTf.getText();
			if (srcTxt.length() == 0 || dstTxt.length() == 0)
				JOptionPane.showMessageDialog(this, "경로를 입력해 주세요");
			else {
				File srcFile = new File(srcTxt);
				File dstFile = new File(dstTxt);
				if (!srcFile.exists()) {
					JOptionPane.showMessageDialog(this, "소스파일이 존재하지 않습니다.");
					return;
				}
				try {
					FileInputStream fi = new FileInputStream(srcFile);
					FileOutputStream fo = new FileOutputStream(dstFile);
					if (!dstFile.exists())
						dstFile.createNewFile();
					int value = 0;
					while ((value = fi.read()) != -1) {
						fo.write(value);
					}
					JOptionPane.showMessageDialog(this, "복사가 완료되었습니다.");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

		}
		else if (obj == exitBtn)
			System.exit(0);

	}

	public static void main(String[] args) {
		new CopyToFile("파일 복사기");
	}
}
