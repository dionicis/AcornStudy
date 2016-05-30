package d20160530;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Memo extends JFrame implements ActionListener {
	JTextArea	jta;
	JMenuBar	jmb;
	JMenu		jmFile, jmHelp;
	JMenuItem	miNew, miOpen, miSave, miClose, miHelp;
	JScrollPane	jsp;

	public Memo(String title) {
		super(title);
		setBounds(100, 100, 800, 600);

		jta = new JTextArea();
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);// 항상있게? 필요할때만? 없게?
		jta.setFont(new Font("gothic", 0, 16));
		add(jsp);

		miNew = new JMenuItem("새로 만들기(N)");
		miOpen = new JMenuItem("열기(O)");
		miSave = new JMenuItem("저장(S)");
		miClose = new JMenuItem("끝내기(X)");
		miHelp = new JMenuItem("도움말 보기(H)");

		miNew.addActionListener(this);
		miOpen.addActionListener(this);
		miSave.addActionListener(this);
		miHelp.addActionListener(this);
		miClose.addActionListener(this);

		jmFile = new JMenu("파일(F)");
		jmFile.add(miNew);
		jmFile.add(miOpen);
		jmFile.add(miSave);
		jmFile.addSeparator();
		jmFile.add(miClose);
		jmHelp = new JMenu("도움말(H)");
		jmHelp.add(miHelp);

		jmb = new JMenuBar();
		jmb.add(jmFile);
		jmb.add(jmHelp);

		setJMenuBar(jmb);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == miClose)
			System.exit(0);
		else if (obj == miNew) {
			String data = jta.getText();
			if (data.length() != 0) {
				int result = JOptionPane.showConfirmDialog(this, "저장하시겠습니까?", "확인",
						JOptionPane.YES_NO_OPTION);
				if (result == 0) {
					// 저장
					jta.setText(" ".trim());
				}
			}
			else
				jta.setText(" ".trim());
		}
		else if (obj == miOpen) {
			System.out.println("열기");
			JFileChooser jfc = new JFileChooser("c:\\");
			int value = jfc.showOpenDialog(this);
			if (value == 0) {
				File f = jfc.getSelectedFile();
				FileReader fr = null;
				BufferedReader br = null;
				StringBuffer sb = new StringBuffer();
				String data = null;

				try {
					fr = new FileReader(f);
					br = new BufferedReader(fr);

					while ((data = br.readLine()) != null) {
						sb.append(data);
					}

				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException ie) {
					ie.printStackTrace();
				}
				jta.setText(sb.toString());
			}
		}
		else if (obj == miSave) {
			System.out.println("저장");
			JFileChooser jfc = new JFileChooser("c:\\");
			int value = jfc.showSaveDialog(this);
			if (value == 0) {
				File f = jfc.getSelectedFile();
				FileWriter fw = null;
				BufferedWriter bw = null;

				try {
					fw = new FileWriter(f);
					bw = new BufferedWriter(fw);
					bw.write(jta.getText());
					bw.flush();
				} catch (FileNotFoundException e2) {
					e2.printStackTrace();
				} catch (IOException ie) {
					ie.printStackTrace();
				}

				String name = f.getName();
				String[] names = name.split("\\.");
				setTitle(names[0] + "- 메모장");
			}
		}

		else if (obj == miHelp) {
			JOptionPane.showMessageDialog(this, "이 프로그램은 무단 복제를 금합니다.", "도움말",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	public static void main(String[] args) {
		new Memo("제목 없음");
	}
}
