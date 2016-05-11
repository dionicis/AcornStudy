package d20160509;

public class StatementHw4 {
	public static void main(String[] args) {
		// int i = 0;
		// for (int idx = 0; idx < 5; idx++) {
		// i += idx+1;
		// System.out.println(i);
		// }

		for (int idx = 0; idx < 5; idx++) { //int형 변수 idx를 0으로 초기화하고 idx가 5보다 작을때까지 반복하면서 idx를 증가시킴
			int num = 0; //int형 변수 num에 0을 대입
			for (int j = 0; j < idx + 1; j++) //int형 변수 j를 0으로 초기화하고 j가 idx+1보다 작을때까지 반복하면서 j를 증가시킴
				num += j+1; //num과 j+1을 더한값을 num에 대입
			System.out.println(num);//num을 출력
		}
	}
}
