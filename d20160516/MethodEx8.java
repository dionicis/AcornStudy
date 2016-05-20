package d20160516;

public class MethodEx8 {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static int add(int... arr) {

		int sum = 0;
		for (int i : arr)
			sum += i;
		
		for(int i=0; i<arr.length; i++)
			sum += arr[i];
		return sum;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		int k = add(a, b);
		int m = add(a, b, c);
		System.out.println("k = " + k);
		System.out.println("m = " + m);

		System.out.println("========================");
		// 가변인수
		int n = add(100, 200, 500, 1000);
		int n2 = add(2000, 1000, 2000, 3000, 10, 20, 30, 40);

		System.out.println("n = " + n);
		System.out.println("n2 = " + n2);
	}
}
