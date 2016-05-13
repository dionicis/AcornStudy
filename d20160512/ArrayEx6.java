package d20160512;

public class ArrayEx6 {
	public static void main(String[] args) {
//		int[] a = new int[3];
		int[] a = {3, 9, 2};
		System.out.println("a + " + a);

		// 베열의 크기
		System.out.println("길이 : " + a.length);

		// 배열에 값 담기

		for (int i = 0; i < a.length; i++)
			a[i] = (i+1)*10;
		
		// 배열 요소 출력
		// 반복문 사용해서 출력
		// for(int i : a)
		// System.out.println(i);

		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
