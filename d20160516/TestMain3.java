package d20160516;

public class TestMain3 {
	public static void main(String[] args) {
		
		Monkey m1 = new Monkey();
		System.out.println(m1.성별);
		System.out.println(m1.나이);
		
		Monkey m2 = new Monkey(20,"암컷", "안경원숭이");
		System.out.println(m2.성별);
		System.out.println(m2.나이);
		System.out.println(m2.종류);
		
	}
}
