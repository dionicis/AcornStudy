package d20160523;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindow extends Frame implements WindowListener{
	public MyWindow(String title){
		super(title);//부모의 생성자중 String을 매개변수로 갖는 생성자를 호출
		setBounds(50,50,800,600);//MyWindow 창을 화면 좌측 상단으로 부터 x축으로 50만큼 y축으로 50만큼 위치시키고 너비 800 높이 600인 창을 만든다.
		this.addWindowListener(this);//자기 자신에 윈도우 리스너 인터페이스를 구현하고 이 클래스에 윈도우 리스너를 추가한다. 
		setVisible(true); // 창을 보이게 한다.
		
		
	}
	
	public static void main(String[] args) {
		new MyWindow("종료창 만들기"); //타이틀이 종료창 만들기인 MyWindow 를 객체화 한다.
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("창이 처음 열렸을 때 호출");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("창이 종료 중일때 호출");
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("창이 닫힌 후에 호출");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("최소화 버튼을 누르면 호출");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("창이 아이콘상태에서 되돌아 올때 호출");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("창이 활성화 되었을때 호출");//창이 진한색일때
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("창이 비활성화 되었을때 호출");//다른창이 활성화 되었을때
		
	}
}
