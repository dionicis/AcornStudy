package d20160513HW;

public class Hw6 {
	public static void main(String[] args) {
		// score 배열에 국어 영어 수학 점수가
		// 들어있다. 총점과 평균을 계산해서 배열에 담은후 모든 학생의 국어 , 영어, 수학, 총점, 평균를 출력하시오
		// 참고 ) 배열에는 국어 , 영어 ,수학 점수 만 들어있다.
		int[][] score = {	{ 80, 80, 80, 0, 0 }, 
		                 	{ 60, 80, 45, 0, 0 },
		                 	{ 80, 50, 90, 0, 0 }, 
		                 	{ 80, 72, 90, 0, 0 },
							{ 60, 87, 100, 0, 0}, 
							{ 42, 55, 99, 0, 0 }};

		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++)
				sum += score[i][j];
			score[i][3] = sum;
			score[i][4] = sum / 3;
		}

		for (int i = 0; i < score.length; i++)
			System.out.println("국어 : " + score[i][0] + " 수학 : " + score[i][1] + " 영어 : " + score[i][2] + " 총점 : "
					+ score[i][3] + " 평균 : " + score[i][4]);
	}
}
