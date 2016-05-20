package d20160520;
// sun 에서 프로그램 하는데 필요한걸 만들어놈
// API(Application Programming Interface)
import java.awt.Frame;
import java.lang.*;

public class MyWin extends Frame{
	MyWin(){
//		super();
		super("자바자바 창");
		//창을 보이게 설정
		setVisible(true);
		//창의 크기를 설정
		setSize(400,300);
		//창의 위치 이동
		setLocation(300,400);
		//타이틀 주기
		//setTitle("자바 창");
	}
	
}
