package d20160513;

public class Hw1 {
	public static void main(String[] args) {
		int[][] arr = new int[9][3];
		for (int i = 0; i < 9; i++) {
			arr[i][0] = 3;
			arr[i][1] = i + 1;
			arr[i][2] = arr[i][0] * arr[i][1];
		}

		for (int i = 0; i < 9; i++) 
			System.out.println(arr[i][0]+" * "+arr[i][1]+" = "+arr[i][2]);
	
		
	}
}
