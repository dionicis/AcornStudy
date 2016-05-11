package d20160509;

public class StatementHw2 {
	public static void main(String[] args) {
		for(int idx=0; idx<5; idx++){//int형 변수 idx를 0으로 초기화하고 idx가 5보다 작을때까지 반복하면서 idx를 증가시킴
			for(int i =0; i<idx+1; i++)//int형 변수 i를 0으로 초기화하고 i가 idx+1보다 작을때까지 반복하면서 idx를 증가시킴
				System.out.print("*"); //*를 출력
			System.out.println();
		}
	}
}
