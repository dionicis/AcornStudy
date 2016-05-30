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

	// ���ÿ� ���� ���� �۾��ϴٺ��� �߻��Ǵ� ����
	// DB���� lock, java������ synchronized ���

	// ���

	public synchronized void deposit(int bal) {
		this.balance += bal;
		System.out.println(bal + "�� �Ա��մϴ�.");
		System.out.println("�ܾ� : " + balance + "�� �Դϴ�.");
	}

	public synchronized void withdraw(int bal) {
		if (this.balance >= bal) {
			this.balance -= bal;
			System.out.println(bal + "�� ����մϴ�.");
		}
		else
			System.out.println("�ܾ��� �����մϴ�.");
		
		System.out.println("�ܾ� : " + balance + "�� �Դϴ�.");
	}
}
