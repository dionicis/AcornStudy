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

	// �� �޼���� �ݵ�� �ݵ�� �������̵� �ؼ� ����ؾ߸� �Ѵ�.
	abstract void eat();

	abstract void sleep();
}
