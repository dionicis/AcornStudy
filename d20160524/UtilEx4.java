package d20160524;

import java.util.Calendar;

public class UtilEx4 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		cal.set(2016, 3, 1);
		// System.out.println(cal);

		// �� ~ ��
		// 1~7
		int d = cal.get(Calendar.DAY_OF_WEEK);
		// System.out.println(d);

		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		int cnt = 1;
		for (int j = 1; j < d; j++) {
			System.out.print("\t");
			cnt++;
		}

		for (int i = 1; i < 32; i++) {
			System.out.print(i + "\t");
			if (cnt % 7 == 0)
				System.out.println();
			cnt++;
		}
	}
}
