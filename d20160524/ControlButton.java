package d20160524;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ControlButton extends Frame implements KeyListener {

	Button btn;// Button 클래스를 참조변수 btn로 선언

	public ControlButton(String title) {// ControlButton클래스의 String 타입 매개변수
										// title를 갖는 생성자 정의
		super(title);// 부모객체 Frame의 String을 매개변수로 갖는 생성자 호출
		setLayout(null);// 레이아웃을 null로 설정
		setBounds(100, 50, 1000, 800);// 창의 위치와 크기를 설정
		btn = new Button("^.^");// btn을 객체화
		btn.setBounds(200, 300, 100, 100); // 창 내의 btn위치를 설정
		btn.addKeyListener(this);// 버튼에 KeyListener 인터페이스를 추가
		add(btn);// 현재 창에 버튼 추가

		this.addWindowListener(new WindowAdapter() { // 윈도우 어댑터인 익명의 클래스를 선언
			@Override
			public void windowClosing(WindowEvent e) {// 윈도우창 x를 누를시 창이 닫힘
				System.exit(0);
			}
		});

		setVisible(true);// 창을 보이게 설정

	}

	public static void main(String[] args) {
		new ControlButton("Control");// ControlButton 객체 생성
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {// 키를 눌렀을때 함수 호출
		int btnX = btn.getX();// 버튼의 x좌표를 int형 변수 btnX에 담는다
		int btnY = btn.getY();// 버튼의 y좌표를 int형 변수 btnY에 담는다.

		if (e.getKeyCode() == 37)// 키보드의 누른 값이 왼쪽 화살표 이면
			btnX -= 20;// btnX에서 20을 뺀다
		else if (e.getKeyCode() == 39)// 키보드의 누른 값이 오른쪽 화살표 이면
			btnX += 20;// btnX에서 20을 더한다
		else if (e.getKeyCode() == 38)// 키보드의 누른 값이 위쪽 화살표 이면
			btnY -= 20;// btnY에서 20을 뺀다
		else if (e.getKeyCode() == 40)// 키보드의 누른 값이 아래쪽 화살표 이면
			btnY += 20;// btnY에서 20을 더한다
		else if (e.getKeyCode() == 32) {// 키보드의 누른 값이 스페이스바 이면
			for (int i = 0; i < 140; i++) {// int 형 변수 i가 140보다 작을때 까지 i를 늘려가면서
				if (i < 70)// i가 70보다 작으면
					btnY -= 2;// btnY에서 2를 빼고
				else// i가 70보다 크면
					btnY += 2;// btnY에서 2를 더한다.

				btn.setLocation(btnX, btnY);// 버튼의 위치를 btnX와 btnY좌표로 설정한다.
				try {// 10밀리세컨동안 잠시 멈춤
					Thread.sleep(10);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			return; //현재 조건문을 만족하면 함수를 빠져나간다.
		}

		btn.setLocation(btnX, btnY);//버튼의 위치를 btnX와 btnY좌표로 설정한다.

	}

	@Override
	public void keyReleased(KeyEvent e) {}
}
