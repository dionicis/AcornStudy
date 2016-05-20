package d20160516;

public class MethodEx9 {

	static String mergeWord(String... strings) {
		String result = new String();
		// 향상된 for 문, 개선된 for 문
		for (String s : strings)
			result += s;
		return result;
	}
	

	public static void main(String[] args) {
		String str = mergeWord("오늘은", "월요일");
		System.out.println("str = " + str);
		System.out.println(mergeWord("대한", "민국", "만세"));
		System.out.println(mergeWord("자바", "가변", "인수", "메서드"));
	}
}
