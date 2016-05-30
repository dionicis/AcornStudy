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
	TextArea	txtArea; //TextArea 클래스를 현재 클래스의 멤버변수 txtArea로  선언
	MenuBar		mb;//MenuBar 클래스를 현재 클래스의 멤버변수 mb로  선언
	Menu		muFile, muHelp;//Menu 클래스를 현재 클래스의 멤버변수 muFile, muHelp로  선언
	MenuItem	miNew, miOpen, miSave, miExit, miHelp;//MenuItem 클래스를 현재 클래스의 멤버변수 miNew, miOpen, miSave, miExit, miHelp로  선언

	public MemoJJang(String title) {//String 타입  변수 title을 매개변수로 갖는 생성자를 정의
		super(title);//현재 클래스의 부모 클래스의 생성자중 String타입 을 매개변수로 갖는 생성자를 호출
		setBounds(200, 100, 800, 600);//창의 위치와 크기를 설정
		addWindowListener(new WindowAdapter() {//windowAdapter 클래스를 익명의 클래스로 선언
			@Override
			public void windowClosing(WindowEvent e) {//윈도우 창의 x버튼을 누르면 창을 종료하는 메소드를 정의
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		txtArea = new TextArea("", 5, 40);//txtArea를 내용이 없고 행이 5 열이 40인 객체로 초기화
		txtArea.setFont(new Font("fon", 0, 20));//txtArea의 폰트 크기를 설정
		add(txtArea);//txtArea를 추가

		miNew = new MenuItem("새로 만들기"); //MenuItem클래스를 객체 miNew를 "새로만들기"이름으로 초기화
		miOpen = new MenuItem("열기");//MenuItem클래스를 객체 miOpen를 "열기"이름으로 초기화
		miSave = new MenuItem("저장");//MenuItem클래스를 객체 miSave를 "저장"이름으로 초기화
		miExit = new MenuItem("끝내기");//MenuItem클래스를 객체 miExit를 "끝내기"이름으로 초기화
		miHelp = new MenuItem("도움말 보기");//MenuItem클래스를 객체 miHelp를 "도움말 보기"이름으로 초기화

		muFile = new Menu("파일(F)");//Menu클래스를 객체 muFile를 "파일(F)"이름으로 초기화
		muHelp = new Menu("도움말");//Menu클래스를 객체 muHelp를 "도움말"이름으로 초기화

		mb = new MenuBar();//MenuBar클래스의 객체 mb를 초기화

		muFile.add(miNew);//muFile에 miNew 추가
		muFile.add(miOpen);//muFile에 miOpen 추가
		muFile.add(miSave);//muFile에 miSave 추가
		muFile.addSeparator();//분리선 추가
		muFile.add(miExit);//muFile에 miExit 추가
		muHelp.add(miHelp);//muFile에 miHelp 추가

		mb.add(muFile);//mb에 muFile 추가
		mb.add(muHelp);//mb에 muHelp 추가

		setMenuBar(mb); //메뉴바 mb를 추가

		miNew.addActionListener(this); //miNew에 액션 리스너를 구현한 현재 클래스를 추가
		miOpen.addActionListener(this);//miOpen에 액션 리스너를 구현한 현재 클래스를 추가
		miSave.addActionListener(this);//miSave에 액션 리스너를 구현한 현재 클래스를 추가
		miExit.addActionListener(this);//miExit에 액션 리스너를 구현한 현재 클래스를 추가
		miHelp.addActionListener(this);//miHelp에 액션 리스너를 구현한 현재 클래스를 추가

		setVisible(true);//윈도우 창을 보이도록 설정
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();//ActionEvent타입 의 매개변수 e의 객체를 Object타입 obj에 담음
		if (obj == miExit)//obj가 miExit과 같다면
			System.exit(0);//시스템을 닫는다
		else if (obj == miNew)//obj가 miNew와 같다면
			txtArea.setText(" ");
	}

	public static void main(String[] args) {
		new MemoJJang("메모장");
	}
}
