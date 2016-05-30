package d20160527;

import java.util.Random;

public class ATMThread extends Thread {
	ATM		atm;
	Random	rnd;

	public ATMThread(ATM atm) {
		this.atm = atm;
		rnd = new Random();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean flag = true;
		for (int i = 0; i < 10; i++) {
			if (flag)
				atm.deposit(rnd.nextInt(5) * 1000);
			else
				atm.withdraw(rnd.nextInt(5) * 1000);
			flag = !flag;
		}
	}

	public static void main(String[] args) {
		ATM atm = new ATM("1003745", 50000);
		ATMThread at1 = new ATMThread(atm);
		ATMThread at2 = new ATMThread(atm);
		ATMThread at3 = new ATMThread(atm);
		at1.start();
		at2.start();
		at3.start();
	}

}
