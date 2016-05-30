package d20160527;

public class ATM {
	private String	account;
	private int		balance;

	public ATM() {

	}

	public ATM(String account, int balance) {
		this.account = account;
		this.balance = balance;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 동시에 서로 같이 작업하다보면 발생되는 문제
	// DB에는 lock, java에서는 synchronized 사용

	// 출금

	public synchronized void deposit(int bal) {
		this.balance += bal;
		System.out.println(bal + "원 입금합니다.");
		System.out.println("잔액 : " + balance + "원 입니다.");
	}

	public synchronized void withdraw(int bal) {
		if (this.balance >= bal) {
			this.balance -= bal;
			System.out.println(bal + "원 출금합니다.");
		}
		else
			System.out.println("잔액이 부족합니다.");
		
		System.out.println("잔액 : " + balance + "원 입니다.");
	}
}
