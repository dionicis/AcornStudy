package d20160513HW;

public class Hw6 {
	public static void main(String[] args) {
		// score �迭�� ���� ���� ���� ������
		// ����ִ�. ������ ����� ����ؼ� �迭�� ������ ��� �л��� ���� , ����, ����, ����, ��ո� ����Ͻÿ�
		// ���� ) �迭���� ���� , ���� ,���� ���� �� ����ִ�.
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
			System.out.println("���� : " + score[i][0] + " ���� : " + score[i][1] + " ���� : " + score[i][2] + " ���� : "
					+ score[i][3] + " ��� : " + score[i][4]);
	}
}
