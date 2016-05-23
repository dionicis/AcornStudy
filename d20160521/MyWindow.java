package d20160521;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindow extends Frame implements WindowListener{
	public MyWindow(String title){
		super(title);//부모의 생성자중 String을 매개변수로 갖는 생성자를 호출
		setBounds(50,50,800,600);
		this.addWindowListener(this);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new MyWindow("종료창 만들기");
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
