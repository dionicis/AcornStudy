package d20160525;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class PrintLotto {
	public static void main(String[] args) {
		// 1. 6ĭ¥�� �迭 ����
		int[] lotto = new int[6];

		// 2. �����ϰ� 1���� 45������ ���ڸ� �̾Ƽ� �迭�� ��´�.
		// 3. �ߺ� ����
		Random ran = new Random();
		HashSet<Integer> hs = new HashSet<Integer>();

		while (hs.size() != 6) {
			int num = ran.nextInt(45) + 1;
			hs.add(num);
		}
		Iterator<Integer> it = hs.iterator();
		
		for (int i = 0; i < lotto.length; i++)
			lotto[i] = it.next();
		
		// 4. ���� ��Ų��.
		Arrays.sort(lotto);
		// 5. ���

		for (int i : lotto)
			System.out.print(i + " ");
		System.out.println();
	}
}
