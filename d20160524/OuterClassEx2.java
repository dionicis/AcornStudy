package d20160524;

public class OuterClassEx2 {
	private int			a	= 10;
	static int			b	= 20;
	static final int	c	= 30;

	static class StaticInnerClass {
		int					d	= 30;
		static int			e	= 40;
		static final int	f	= 40;

		public void print() {// static 변수만 사용 가능
			// non static 변수 접근이 안됨
	//		System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
			System.out.println("d : " + d);
			System.out.println("e : " + e);
			System.out.println("f : " + f);
		}
	}
	public static void main(String[] args) {
		StaticInnerClass sic = new StaticInnerClass();
		sic.print();
	}
}
