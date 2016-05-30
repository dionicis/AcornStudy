package d20160525;

//미확정 타입 : T
//<>에 자료형이 오면 된다고 표시해줌 ->공통된 특성을 일반화
//generic : 자료형을 컴파일시에 결정한느 것이 아니라
//Runtime 시점에서 결정하도록 일반화 시켰다.
//유지보수를 편하게 하기 위해서
public class GenEx1<T> {
	T[] str; //String배열 참조변수 str 선언.

	public void setArray(T[] str) { // T배열을 매개변수로 받는 메소드 정의
		this.str = str;// 매개변수 str을 클래스 멤버 변수 str에 담음
	}

	public void print() {// str의 요소를 출력하는 메소드
		for (T s : str)
			System.out.println(s);// str의 요소를 출력
	}
}
