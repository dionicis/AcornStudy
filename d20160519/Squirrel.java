package d20160519;

public class Squirrel extends Mammalia{

	int	tail;

	Squirrel() {
		tail = 1;
	}
	
	@Override
	void eat() {
		System.out.println("�ȳ�");
	}
	
	@Override
	void sleep() {
		System.out.println("Zzzz..");
	}

	void climb() {
		System.out.println("������");
	}
}
