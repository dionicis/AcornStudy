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
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);// �׻��ְ�? �ʿ��Ҷ���? ����?
		jta.setFont(new Font("gothic", 0, 16));
		add(jsp);

		miNew = new JMenuItem("���� �����(N)");
		miOpen = new JMenuItem("����(O)");
		miSave = new JMenuItem("����(S)");
		miClose = new JMenuItem("������(X)");
		miHelp = new JMenuItem("���� ����(H)");

		miNew.addActionListener(this);
		miOpen.addActionListener(this);
		miSave.addActionListener(this);
		miHelp.addActionListener(this);
		miClose.addActionListener(this);

		jmFile = new JMenu("����(F)");
		jmFile.add(miNew);
		jmFile.add(miOpen);
		jmFile.add(miSave);
		jmFile.addSeparator();
		jmFile.add(miClose);
		jmHelp = new JMenu("����(H)");
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
				int result = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?", "Ȯ��",
						JOptionPane.YES_NO_OPTION);
				if (result == 0) {
					// ����
					jta.setText(" ".trim());
				}
			}
			else
				jta.setText(" ".trim());
		}
		else if (obj == miOpen) {
			System.out.println("����");
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
			System.out.println("����");
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
				setTitle(names[0] + "- �޸���");
			}
		}

		else if (obj == miHelp) {
			JOptionPane.showMessageDialog(this, "�� ���α׷��� ���� ������ ���մϴ�.", "����",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	public static void main(String[] args) {
		new Memo("���� ����");
	}
}
