package d20160523;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindow extends Frame implements WindowListener{
	public MyWindow(String title){
		super(title);//�θ��� �������� String�� �Ű������� ���� �����ڸ� ȣ��
		setBounds(50,50,800,600);//MyWindow â�� ȭ�� ���� ������� ���� x������ 50��ŭ y������ 50��ŭ ��ġ��Ű�� �ʺ� 800 ���� 600�� â�� �����.
		this.addWindowListener(this);//�ڱ� �ڽſ� ������ ������ �������̽��� �����ϰ� �� Ŭ������ ������ �����ʸ� �߰��Ѵ�. 
		setVisible(true); // â�� ���̰� �Ѵ�.
		
		
	}
	
	public static void main(String[] args) {
		new MyWindow("����â �����"); //Ÿ��Ʋ�� ����â ������� MyWindow �� ��üȭ �Ѵ�.
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("â�� ó�� ������ �� ȣ��");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("â�� ���� ���϶� ȣ��");
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("â�� ���� �Ŀ� ȣ��");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("�ּ�ȭ ��ư�� ������ ȣ��");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("â�� �����ܻ��¿��� �ǵ��� �ö� ȣ��");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("â�� Ȱ��ȭ �Ǿ����� ȣ��");//â�� ���ѻ��϶�
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("â�� ��Ȱ��ȭ �Ǿ����� ȣ��");//�ٸ�â�� Ȱ��ȭ �Ǿ�����
		
	}
}
