package d20160521;

public class StringEx2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Java Oracle";

		char ch = str.charAt(3);

		System.out.println("ch : " + ch);
		String str2 = "월요일";
		System.out.println(str.concat(str2));

		String s1 = "월요일";
		String s2 = "화요일";
		String s3 = "수요일";
		String s4 = "목요일";
		String s5 = "금요일";
		String s6 = "토요일";
		String s7 = "일요일";

		// method chain
		System.out.println(s1.concat(" " + s2).concat(" " + s3).concat(" " + s4).concat(" " + s5).concat(" " + s6)
				.concat(" " + s7));

		System.out.println();
		String t = str.concat(str2);
		System.out.println("t : " + t);
		System.out.println(str.contains("Java"));// String str에 문자열 "Java"가 있는지
													// true false로 반환

		if (str.equalsIgnoreCase("JAVA ORACLE"))// 대소문자 무시하고 내용비교
			System.out.println("대소문자가 다름");

		int idx = str.indexOf('r');// 'r'이라는 문자가 몇번째 있는지 int형 값으로 반환
		System.out.println(idx);

		// 문자열의 부분집합
		// 2번부터 6번전까지 글자
		// Java Oracle
		System.out.println(str.substring(2, 6));// va O

		char[] chArray = str.toCharArray(); // 문자열을 문자 배열로 바꿔주는 메소드

		for (char c : chArray)
			System.out.print(c + " ");// chArr 배열의 문자를 출력
		System.out.println();

		int a = 20;
		String value = String.valueOf(a);// 숫자 20을 문자열 20으로 변환
		System.out.println(value);

		System.out.println("======================");

		String email = "dagda@hanafos.com";
		int index = email.indexOf('@');
		String id = email.substring(0, index);
		System.out.println(id);
		System.out.println(email.substring(0, email.indexOf('@')));

		System.out.println("=======================");
		String txt = "오늘은,월요일,내일은,화요일";

		for (String s : txt.split(","))
			System.out.println(s);

	}
}
