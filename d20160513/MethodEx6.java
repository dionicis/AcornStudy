package d20160513;

public class MethodEx6 {
	static void printMsg(String str) {
		System.out.println(str + " 자바!");
	}

	static void sayHello() {
		System.out.println("곤니찌와.");
	}

	static void maxInt(int num1, int num2) {
		int max = (num1 >= num2) ? num1 : num2;

		System.out.println("큰값은 : " + max);
	}

	static int getNumber(int num1, int num2, int num3, int num4, int num5) {
		int[] arr = new int[4];
		arr[0] = num1;
		arr[1] = num2;
		arr[2] = num3;
		arr[3] = num4;

		return arr[num5 - 1];
	}

	static int getInt(int[] temp, int position) {
		temp[position -1] = -100;
		return temp[position - 1];
	}

	public static void main(String[] args) {
		printMsg("Hello");
		sayHello();
		int a = 200;
		int b = 100;
		maxInt(a, b);

		int[] m = { 200, 3000, 1000, 240 };
		// 3번째 값을 뽑기
		// int k = getNumber(200,3000,1000,240,3);
		int[] k = new int[3];// 꼭 초기화 해줘야댐
		k = m; // heap영역에 접글할수 있다.
		System.out.println(m);
		System.out.println(k);

		System.out.println(getInt(m, 3));
		System.out.println(m[2]);
	}
}
