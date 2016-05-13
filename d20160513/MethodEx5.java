package d20160513;

public class MethodEx5 {
	static int a = 100;
	static int b = 200;
	
	static int add(int c, int d){
		return c+d;
	}
	public static void main(String[] args) {
		int c = add(a,b);
		System.out.println("c : " + c);
	}
}
