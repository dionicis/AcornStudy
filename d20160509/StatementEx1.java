package d20160509;

public class StatementEx1 {
	public static void main(String[] args) {
		int su = 1; //int형 변수 su에 1을 넣음
		for (int i = 1; i <= 9; i++) { //int형 변수 i를 선언하고 i가 9보다 작으면 실행, i를 1만큼 증가
			// System.out.println("3 * 1 = 3 ");
			// System.out.println("3 * " + su + "= 3 ");

//			System.out.println("3 * " + su + " = " + 3 * su); //3단 구구단 출력
			System.out.println("su : " + su + " i :  " + i); //su와 i를 출력
			su++;
		}
	}
}
