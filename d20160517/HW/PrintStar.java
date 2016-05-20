package d20160517.HW;

public class PrintStar {
	int star;

	PrintStar(int star) {
		this.star = star;
	}

	void print() {
		for (int i = 0; i < star; i++) {
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
