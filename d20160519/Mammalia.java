package d20160519;

public abstract class Mammalia {
	protected int	ear;
	protected int	eye;
	protected int	nose;
	protected int	mouth;

	Mammalia() {
		ear = 2;
		eye = 2;
		nose = 1;
		mouth = 1;
	}

	// 이 메서드는 반드시 반드시 오버라이드 해서 사용해야만 한다.
	abstract void eat();

	abstract void sleep();
}
