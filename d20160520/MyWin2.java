package d20160520;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin2 extends Frame{
	Button btn;
	ActionListener act;
	
	MyWin2(){
		super("������2");
		btn = new Button("��ư1");
		setLocation(400,200);
		setSize(500, 300);
		//event ó��
		//1 event source ���� : btn
		//2.������ ����
		//Handler ��  ActionListener �������̽��� ������ Ŭ����
		Handler hd = new Handler();
		//add();
		btn.addActionListener(hd);		
		add(btn);
		
		setVisible(true);
	}
}

class Handler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�ƾ�");
		System.out.println("�����մϴ�...");
		System.exit(0);//0: ��������
		//�ٸ� �� : ������ ����
		
	}

}
