package d20160519;

public class Horse extends Mammalia implements Flyable {
	int		tail;
	String	color;

	public void run() {
		System.out.println("��~ �޸���");
	}

	@Override
	void eat() {
		System.out.println("��������");

	}

	@Override
	void sleep() {
		System.out.println("�����ڿ�");

	}
	
	@Override
	public void fly() {
		System.out.println("������!");
	}

}
