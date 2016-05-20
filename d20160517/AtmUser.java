package d20160517;

public class AtmUser {
	public static void main(String[] args) {
		ATM atm = new ATM();
//	    atm.balance = 999999999;
		atm.setBalance(99999);
		atm.deposit(50000);
		atm.withDraw(60000);
		atm.setAccount("ภฬย๙วเ");
		String acc = atm.getAccount();
		System.out.println(acc);
	}
}
