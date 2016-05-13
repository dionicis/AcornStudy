package d20160513;

public class MethodEx4 {
	
	static int mul(int a , int b){
		a++;
		return a*b;
	}
	public static void main(String[] args) {
		int a = 100;
		int b = 200;

		int c = mul(a, b);
		System.out.println("c : " + c);
	}
}
