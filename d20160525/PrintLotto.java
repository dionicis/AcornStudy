package d20160525;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class PrintLotto {
	public static void main(String[] args) {
		// 1. 6칸짜리 배열 선언
		int[] lotto = new int[6];

		// 2. 랜덤하게 1부터 45사이의 숫자를 뽑아서 배열에 담는다.
		// 3. 중복 제거
		Random ran = new Random();
		HashSet<Integer> hs = new HashSet<Integer>();

		while (hs.size() != 6) {
			int num = ran.nextInt(45) + 1;
			hs.add(num);
		}
		Iterator<Integer> it = hs.iterator();
		
		for (int i = 0; i < lotto.length; i++)
			lotto[i] = it.next();
		
		// 4. 정렬 시킨다.
		Arrays.sort(lotto);
		// 5. 출력

		for (int i : lotto)
			System.out.print(i + " ");
		System.out.println();
	}
}
