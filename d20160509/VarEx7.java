package d20160509;

//7순위 : 삼항연산자
public class VarEx7 {
	public static void main(String[] args) {
		int a = 10; //a라는 int형 변수에 10을 넣음
		int b = 5; //b라는 int형 변수에 5을 넣음
		// (조건)? "참" : "거짓"

		System.out.println((a > b) ? "참" : "거짓"); //a가 b보다 크면 "참"을출력 그렇지 않으면 "거짓출력"
		System.out.println((a < b) ? "참" : "거짓"); //a가 b보다 작으면 "참"을출력 그렇지 않으면 "거짓출력"
	}
}
