package d20160523;

public class StringEx1 {
	public static void main(String[] args) {
		String str1 = new String("Java");
		String str2 = new String("Java");
		

		System.out.println(str1);
		System.out.println(str2);
		// String class의 toString();

		// Object 클래스의 toString()을 오버라이드 했기 때문에
		// 자기 자신의 문자열을 출력할 수 있다.

		System.out.println("========================");
		if (str1 == str2) {// 참조값 비교
			System.out.println("같은 객체");
		}
		else
			System.out.println("다른 객체");


		//Object : equals() : 참조값 비교 메서드
		//String : equals() : 내용 비교 메서드 - Override
		if (str1.equals(str2))// 내용비교
			System.out.println("동일한 문자열");
		else
			System.out.println("다른 문자열");
		
		
		System.out.println("========================");
		String str3 = "Java";
		String str4 = "Java";
		
		if(str3 == str4)
			System.out.println("O");
		else
			System.out.println("X");
		
		str3 = "Oracle";
		System.out.println(str4);
	}
}
