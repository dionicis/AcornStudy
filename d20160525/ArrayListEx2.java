package d20160525;

public class ArrayListEx2 {
	// 자바는 객체지향 언어입니다.
	// int ==> Integer
	// char ==> Character
	// 나머지는 첫자가 대문자
	// Wrapper Class
	// primitive type의 변수를 감싸서 객체로

	public static void main(String[] args) {
		Byte bt = new Byte((byte) 20);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		int c = 30;
		Integer it = new Integer(c);
		System.out.println(it.floatValue());
		System.out.println(Integer.toBinaryString(it.intValue()));

		///////////////////////////////////////////////////

		Integer it2 = 40;//AutoBoxing
		int k = it2;//unBoxing
		System.out.println("k " + k);

	}
}
