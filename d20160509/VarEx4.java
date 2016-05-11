package d20160509;

//4순위 연산자 : 비교 연산자
// >,<, >=, <=, ==
public class VarEx4 {
	public static void main(String[] args) {
		int a = 100; //a라는 int형 변수에 100을 넣음
		int b = 20; //b라는 int형 변수에 20을 넣음
		System.out.println("a > b: "+(a>b)); //a가 b보다 크면 true값
		System.out.println("a < b: "+(a<b)); //a가 b보다 작으면 true값
		System.out.println("a >= b: "+(a>=b)); //a가 b보다 크거나같으면 true값
		System.out.println("a >= b: "+(a<=b)); //a가 b보다 작거나같으면 true값
		System.out.println("a == b: "+(a==b)); //a가 b보다 같으면 true값
		System.out.println("a != b: "+(a!=b)); //a가 b보다 같지 않으면 true값
	} 
}
