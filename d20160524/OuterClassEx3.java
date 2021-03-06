package d20160524;

public class OuterClassEx3 {
	private int			a	= 10;
	static int			b	= 20;
	static final int	c	= 30;

	public void printAll() {
		// 클래스가 지역변수 처럼 사용
		class LocalInnerClass {
			int					d	= 30;
			// static int e = 40;
			static final int	f	= 50;

			public void print() {// static 변수만 사용 가능
				// non static 변수 접근이 안됨
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				System.out.println("d : " + d);
				// System.out.println("e : " + e);
				System.out.println("f : " + f);
			}
		}// LocalInnerClass end
		LocalInnerClass lic = new LocalInnerClass();
		lic.print();

	}// printAll() end

	public static void main(String[] args) {
		OuterClassEx3 oce3 = new OuterClassEx3();
		oce3.printAll();
	}
}// OuterClassEx3 end
