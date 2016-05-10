package d20160510;

public class StatementEx9 {
	public static void main(String[] args) {
		// 학생의 총점과 평균을 출력
		int kor = 55;
		int eng = 90;
		int mat = 70;

		// 총점과 평균을 출력

		// 이때 평균이 60이상이면 합격 아니면 불합격 메세지 출력

		int sum = kor + eng + mat;
		float avg = (float) sum / 3;

		System.out.println("총점 : " + sum + ", 평균 : " + avg);
		
		if(avg >=60)
			System.out.println("합격!");
		else
			System.out.println("불합격!");

	}
}
