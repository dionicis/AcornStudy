package d20160513;

public class MethodEx2 {

	static void printGuGuDan(int dan) {// 매개변수 parameter 인자 인수 argument
		// 구구단3단출력
		System.out.println("전달받은 인자: " + dan);
		for (int i = 1; i < 10; i++)
			System.out.println(dan + " * " + i + " = " + dan * i);
	}

	// static void printGuGuDan5() {
	// // 구구단3단출력
	// for (int i = 1; i < 10; i++)
	// System.out.println("5 * " + i + " = " + 5 * i);
	//
	// }
	
	static void gauss(int num){
		int sum = 0;
		for(int i=1; i<num+1; i++)
			sum += i;
		System.out.println("1부터 "+num+"까지의 합은 "+sum+"입니다.");
	}
	
	

	public static void main(String[] args) {

//		printGuGuDan(3);
		
		gauss(100);
		//1부터 100까지의 합은 5050입니다.
		gauss(1000);
		//1부터 1000까지의 합은 500500입니다.
	}
}
