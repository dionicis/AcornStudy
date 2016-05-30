package d20160524;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ControlButton extends Frame implements KeyListener {

	Button btn;// Button Ŭ������ �������� btn�� ����

	public ControlButton(String title) {// ControlButtonŬ������ String Ÿ�� �Ű�����
										// title�� ���� ������ ����
		super(title);// �θ�ü Frame�� String�� �Ű������� ���� ������ ȣ��
		setLayout(null);// ���̾ƿ��� null�� ����
		setBounds(100, 50, 1000, 800);// â�� ��ġ�� ũ�⸦ ����
		btn = new Button("^.^");// btn�� ��üȭ
		btn.setBounds(200, 300, 100, 100); // â ���� btn��ġ�� ����
		btn.addKeyListener(this);// ��ư�� KeyListener �������̽��� �߰�
		add(btn);// ���� â�� ��ư �߰�

		this.addWindowListener(new WindowAdapter() { // ������ ������� �͸��� Ŭ������ ����
			@Override
			public void windowClosing(WindowEvent e) {// ������â x�� ������ â�� ����
				System.exit(0);
			}
		});

		setVisible(true);// â�� ���̰� ����

	}

	public static void main(String[] args) {
		new ControlButton("Control");// ControlButton ��ü ����
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {// Ű�� �������� �Լ� ȣ��
		int btnX = btn.getX();// ��ư�� x��ǥ�� int�� ���� btnX�� ��´�
		int btnY = btn.getY();// ��ư�� y��ǥ�� int�� ���� btnY�� ��´�.

		if (e.getKeyCode() == 37)// Ű������ ���� ���� ���� ȭ��ǥ �̸�
			btnX -= 20;// btnX���� 20�� ����
		else if (e.getKeyCode() == 39)// Ű������ ���� ���� ������ ȭ��ǥ �̸�
			btnX += 20;// btnX���� 20�� ���Ѵ�
		else if (e.getKeyCode() == 38)// Ű������ ���� ���� ���� ȭ��ǥ �̸�
			btnY -= 20;// btnY���� 20�� ����
		else if (e.getKeyCode() == 40)// Ű������ ���� ���� �Ʒ��� ȭ��ǥ �̸�
			btnY += 20;// btnY���� 20�� ���Ѵ�
		else if (e.getKeyCode() == 32) {// Ű������ ���� ���� �����̽��� �̸�
			for (int i = 0; i < 140; i++) {// int �� ���� i�� 140���� ������ ���� i�� �÷����鼭
				if (i < 70)// i�� 70���� ������
					btnY -= 2;// btnY���� 2�� ����
				else// i�� 70���� ũ��
					btnY += 2;// btnY���� 2�� ���Ѵ�.

				btn.setLocation(btnX, btnY);// ��ư�� ��ġ�� btnX�� btnY��ǥ�� �����Ѵ�.
				try {// 10�и��������� ��� ����
					Thread.sleep(10);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			return; //���� ���ǹ��� �����ϸ� �Լ��� ����������.
		}

		btn.setLocation(btnX, btnY);//��ư�� ��ġ�� btnX�� btnY��ǥ�� �����Ѵ�.

	}

	@Override
	public void keyReleased(KeyEvent e) {}
}
