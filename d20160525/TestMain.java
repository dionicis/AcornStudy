package d20160525;

public class TestMain {
	//일반화(제너릭)
	public static void main(String[] args) {
		String[] str = { "우리", "나라", "만세" };

		// 이 배열을 멤버 변수로 하는 GenEx1 클래스 생성
		GenEx1<String> ge1 = new GenEx1<String>();// GenEx1클래스를 ge1객체로 인스턴스화
		ge1.setArray(str);// str을 매개변수로 하는 ge1의 setArray 메소드 호출
		// 출력
		ge1.print();// ge1객체의 print() 메소드 호출

		System.out.println("-----------------------------------");

		Integer[] m = { 20, 10, 40, 20, 30 };
//		IntArray ia = new IntArray();
		GenEx1<Integer> ia = new GenEx1<Integer>();
		ia.setArray(m);
		ia.print();

		System.out.println("-----------------------------------");

		Float[] f = { 30.2f, 33.3f, 102.34f };
//		FloatArray fa = new FloatArray();
		GenEx1<Float> fa = new GenEx1<Float>();
		fa.setArray(f);
		fa.print();

	}
}
