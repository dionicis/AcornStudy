package d20160517;

public class GuGuDan {
	int dan;

	GuGuDan() {
		dan = 2;
	}

	GuGuDan(int dan) {
		this.dan = dan;
	}

	void printDan() {
		for (int i = 1; i < 10; i++)
			// System.out.println(dan + " * " + i + " = " + dan * i);
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
	}
}
