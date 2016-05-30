package d20160524;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MemoJJang extends Frame implements ActionListener {
	TextArea	txtArea; //TextArea Ŭ������ ���� Ŭ������ ������� txtArea��  ����
	MenuBar		mb;//MenuBar Ŭ������ ���� Ŭ������ ������� mb��  ����
	Menu		muFile, muHelp;//Menu Ŭ������ ���� Ŭ������ ������� muFile, muHelp��  ����
	MenuItem	miNew, miOpen, miSave, miExit, miHelp;//MenuItem Ŭ������ ���� Ŭ������ ������� miNew, miOpen, miSave, miExit, miHelp��  ����

	public MemoJJang(String title) {//String Ÿ��  ���� title�� �Ű������� ���� �����ڸ� ����
		super(title);//���� Ŭ������ �θ� Ŭ������ �������� StringŸ�� �� �Ű������� ���� �����ڸ� ȣ��
		setBounds(200, 100, 800, 600);//â�� ��ġ�� ũ�⸦ ����
		addWindowListener(new WindowAdapter() {//windowAdapter Ŭ������ �͸��� Ŭ������ ����
			@Override
			public void windowClosing(WindowEvent e) {//������ â�� x��ư�� ������ â�� �����ϴ� �޼ҵ带 ����
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		txtArea = new TextArea("", 5, 40);//txtArea�� ������ ���� ���� 5 ���� 40�� ��ü�� �ʱ�ȭ
		txtArea.setFont(new Font("fon", 0, 20));//txtArea�� ��Ʈ ũ�⸦ ����
		add(txtArea);//txtArea�� �߰�

		miNew = new MenuItem("���� �����"); //MenuItemŬ������ ��ü miNew�� "���θ����"�̸����� �ʱ�ȭ
		miOpen = new MenuItem("����");//MenuItemŬ������ ��ü miOpen�� "����"�̸����� �ʱ�ȭ
		miSave = new MenuItem("����");//MenuItemŬ������ ��ü miSave�� "����"�̸����� �ʱ�ȭ
		miExit = new MenuItem("������");//MenuItemŬ������ ��ü miExit�� "������"�̸����� �ʱ�ȭ
		miHelp = new MenuItem("���� ����");//MenuItemŬ������ ��ü miHelp�� "���� ����"�̸����� �ʱ�ȭ

		muFile = new Menu("����(F)");//MenuŬ������ ��ü muFile�� "����(F)"�̸����� �ʱ�ȭ
		muHelp = new Menu("����");//MenuŬ������ ��ü muHelp�� "����"�̸����� �ʱ�ȭ

		mb = new MenuBar();//MenuBarŬ������ ��ü mb�� �ʱ�ȭ

		muFile.add(miNew);//muFile�� miNew �߰�
		muFile.add(miOpen);//muFile�� miOpen �߰�
		muFile.add(miSave);//muFile�� miSave �߰�
		muFile.addSeparator();//�и��� �߰�
		muFile.add(miExit);//muFile�� miExit �߰�
		muHelp.add(miHelp);//muFile�� miHelp �߰�

		mb.add(muFile);//mb�� muFile �߰�
		mb.add(muHelp);//mb�� muHelp �߰�

		setMenuBar(mb); //�޴��� mb�� �߰�

		miNew.addActionListener(this); //miNew�� �׼� �����ʸ� ������ ���� Ŭ������ �߰�
		miOpen.addActionListener(this);//miOpen�� �׼� �����ʸ� ������ ���� Ŭ������ �߰�
		miSave.addActionListener(this);//miSave�� �׼� �����ʸ� ������ ���� Ŭ������ �߰�
		miExit.addActionListener(this);//miExit�� �׼� �����ʸ� ������ ���� Ŭ������ �߰�
		miHelp.addActionListener(this);//miHelp�� �׼� �����ʸ� ������ ���� Ŭ������ �߰�

		setVisible(true);//������ â�� ���̵��� ����
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();//ActionEventŸ�� �� �Ű����� e�� ��ü�� ObjectŸ�� obj�� ����
		if (obj == miExit)//obj�� miExit�� ���ٸ�
			System.exit(0);//�ý����� �ݴ´�
		else if (obj == miNew)//obj�� miNew�� ���ٸ�
			txtArea.setText(" ");
	}

	public static void main(String[] args) {
		new MemoJJang("�޸���");
	}
}
