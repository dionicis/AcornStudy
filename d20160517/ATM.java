package d20160517;

public class ATM {
	private String	account;// account //���������ڰ� ������ default�Դϴ�
	private int		balance;// Private : ���� ������

	ATM() {

	}

	ATM(String acc, int bal) {
		account = acc;
		balance = bal;
	}

	void deposit(int money) {
		balance += money;
		System.out.println(money + "�� �ԱݵǾ����ϴ�");
		System.out.println("���� �ܾ��� " + balance + "�� �Դϴ�.");
	}

	void withDraw(int money) {
		if (balance >= money) {
			balance -= money;
			System.out.println(money + "�� ��ݵǾ����ϴ�");
			System.out.println("���� �ܾ��� " + balance + "�� �Դϴ�.");
		}
		else {
			System.out.println("�ܾ��� �����մϴ�.");
			System.out.println("���� �ܾ��� " + balance + "�� �Դϴ�.");
		}
	}

	// getXXX setXXX //�޼ҵ�� ������ �ֱ� ������ ������ �ִ��� �Ǻ��Ͽ� ���� �����ϰ� �ٲ�

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
