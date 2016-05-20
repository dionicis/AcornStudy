package d20160517;

public class ATM {
	private String	account;// account //접근제어자가 없으면 default입니다
	private int		balance;// Private : 접근 제어자

	ATM() {

	}

	ATM(String acc, int bal) {
		account = acc;
		balance = bal;
	}

	void deposit(int money) {
		balance += money;
		System.out.println(money + "원 입금되었습니다");
		System.out.println("현재 잔액은 " + balance + "원 입니다.");
	}

	void withDraw(int money) {
		if (balance >= money) {
			balance -= money;
			System.out.println(money + "원 출금되었습니다");
			System.out.println("현재 잔액은 " + balance + "원 입니다.");
		}
		else {
			System.out.println("잔액이 부족합니다.");
			System.out.println("현재 잔액은 " + balance + "원 입니다.");
		}
	}

	// getXXX setXXX //메소드는 로직이 있기 때문에 권한이 있는지 판별하여 값을 안전하게 바꿈

	public void setBalance(int b) {
		balance = b;
	}

	public int getBalance() {
		return balance;
	}
	
	public void setAccount(String s){
		account = s;
	}
	
	public String getAccount(){
		return account;
	}
}
