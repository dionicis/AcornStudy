package d20160523;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends Frame implements ActionListener {
	Label		idLb;
	Label		pwLb;
	TextField	idTf;
	TextField	pwTf;
	Button		logBtn;
	Button		resetBtn;

	public LogIn() {
		super("로그인");
		setLayout(null);
		setBounds(150, 150, 400, 300);
		setBackground(Color.gray);

		idLb = new Label("ID");
		pwLb = new Label("PW");
		idLb.setBounds(100, 75, 50, 25);
		pwLb.setBounds(100, 125, 50, 25);
		add(idLb);
		add(pwLb);

		idTf = new TextField();
		pwTf = new TextField();
		idTf.setBounds(200, 75, 100, 25);
		pwTf.setBounds(200, 125, 100, 25);
		add(idTf);
		add(pwTf);

		logBtn = new Button("로그인");
		resetBtn = new Button("Reset");
		logBtn.setBounds(75, 200, 100, 50);
		resetBtn.setBounds(200, 200, 100, 50);
		logBtn.addActionListener(this);
		resetBtn.addActionListener(this);
		add(logBtn);
		add(resetBtn);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(logBtn)) {//참조객체를 리턴함
			System.out.println("id : "+idTf.getText());
			System.out.println("password : "+pwTf.getText());
			
			if (idTf.getText().equals("aaa") && pwTf.getText().equals("bbb")){
				System.out.println("로그인 되었습니다.");
				new GuGuWin();
			}
			else
				System.out.println("아이디/비밀번호 가 일치하지 않습니다.");
		}

		else if(e.getSource().equals(resetBtn)) {
			System.out.println("reset");
			this.idTf.setText(" ");
			this.pwTf.setText(" ");
		}
	}

	public static void main(String[] args) {
		new LogIn();
	}

}
