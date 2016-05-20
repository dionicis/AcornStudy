package d20160519;

public class Horse extends Mammalia implements Flyable {
	int		tail;
	String	color;

	public void run() {
		System.out.println("말~ 달리자");
	}

	@Override
	void eat() {
		System.out.println("먹을꺼양");

	}

	@Override
	void sleep() {
		System.out.println("서서자요");

	}
	
	@Override
	public void fly() {
		System.out.println("유니콘!");
	}

}
