package d20160520;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MyWin3 extends Frame {
	Button btn1, btn2, btn3, btn4, btn5;
	public MyWin3(){
		
		//창의 크기는 너비 400 높이 400
		setSize(400,400);
		//위치 : 450 , 400
		setLocation(450, 400);
		//제목에는 버튼 배치
		setTitle("버튼배치");
		//컴포넌트 초기화
		btn1 = new Button("동");
		btn2 = new Button("서");
		btn3 = new Button("북");
		btn4 = new Button("남");
		btn5 = new Button("중앙");
		
		FlowLayout f1 = new FlowLayout();
		//현재 Frame의 기본 배치관리자를 FlowLayout으로 변경
		setLayout(f1);
	
		//컴포넌트를 배치하기 쉽게 하기 위해 배치 관리자
		//Frame의 기본 배치 관리자 : 보더 레이 아웃
		add(btn1,"East");
		add(btn2,"West");
		add(btn3,"North");
		add(btn4,"South");
		add(btn5,"Center");
		//창이 보이게 설정
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWin3 mw3 = new MyWin3();
	}
}
