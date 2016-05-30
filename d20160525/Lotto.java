package d20160525;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Lotto {
	private int[] lotto;

	public void makeNumber() {
		int[] result = new int[6];
		Random ran = new Random();
		HashSet<Integer> hs = new HashSet<Integer>();
		while (hs.size() != 6) {
			int num = ran.nextInt(45) + 1;
			hs.add(num);
		}
		Iterator<Integer> it = hs.iterator();

		for (int i = 0; i < result.length; i++)
			result[i] = it.next();
		Arrays.sort(result);

		this.lotto = result;
	}

	public int[] getLotto() {
		return this.lotto;
	}
}
