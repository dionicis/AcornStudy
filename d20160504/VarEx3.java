package d20160504;

public class VarEx3 {
	public static void main(String[] atgs){
		//int 이하 크기의 자료형끼리 연산할때는
		//자동으로 int 로 형변환 한다.
		byte b1 = 10; //b1이라는 이름의  byte크기 변수 선언하고 10을 넣음
		byte b2 = 20; //b2이라는 이름의  byte크기 변수 선언하고 20을 넣음
		short sh1 = 30; //sh1이라는 이름의  short크기 변수 선언하고 30을 넣음
		
//		byte b3 = b1+b2; //합이 int 형
		byte b3 = (byte) (b1+b2);
		int i = b1+b2; //i이라는 이름의  int형크기 변수 선언하고 b1과 b2의 합을 넣음
		
		System.out.println("i : " + i); 
		System.out.println("b3 : " + b3);
		
		int sh2 = sh1+b2; //sh2이라는 이름의  int형 크기 변수 선언하고 sh1과 b2을 넣음
		System.out.println("sh2 : " + sh2);
		///////////////////////////////////////////////
		
		int a = 200; //a이라는 이름의  int형크기 변수 선언하고 200 넣음
		long c = 300L; //c이라는 이름의  long형크기 변수 선언하고 300 넣음
		
		long d = a+c; //d이라는 이름의  long형크기 변수 선언하고 a와 c의 합을 넣음
		System.out.println("d : " + d);
		///////////////////////////////////////////////
		
		float f1 = 300.2f; //f1이라는 이름의  float형크기 변수 선언하고 300.2 넣음
		double d1 = 3090.20d; //d1이라는 이름의  double형크기 변수 선언하고 300 넣음
		
		double k1 = f1 + d1; //k1이라는 이름의  double형크기 변수 선언하고 f1과d1의 합을 넣음
		System.out.println("k1 : "+k1);
	}
}
