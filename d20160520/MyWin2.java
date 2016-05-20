package d20160520;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin2 extends Frame{
	Button btn;
	ActionListener act;
	
	MyWin2(){
		super("윈도우2");
		btn = new Button("버튼1");
		setLocation(400,200);
		setSize(500, 300);
		//event 처리
		//1 event source 결정 : btn
		//2.감지기 부착
		//Handler 는  ActionListener 인터페이스를 구현한 클래스
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
		System.out.println("아얏");
		System.out.println("종료합니다...");
		System.exit(0);//0: 정상종료
		//다른 값 : 비정상 종료
		
	}

}
