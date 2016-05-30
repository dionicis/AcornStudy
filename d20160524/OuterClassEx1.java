package d20160524;

// Inner Class
// memeber Inner Class
// static Inner Class
// local Inner Class
// annonymous Inner Class

public class OuterClassEx1 {
	private int			a	= 10;
	static int			b	= 20;
	static final int	c	= 30;

	class MemberInnerClass {
		int					d	= 30;
		// static int e = 40; �� static�� ���� ���� // memberInnerClass��
		// Outerclass ���� ���� ��������� ���
		// instanceȭ �ؾ� memberInnerClass�� ��� ����
		static final int	f	= 40;

		public void print() {
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
			System.out.println("d : " + d);
			// System.out.println("e : " + e);
			System.out.println("f : " + f);
		}// print() End
	}// MemberInnerClass end

	public static void main(String[] args) {
		OuterClassEx1 oce1 = new OuterClassEx1();
		OuterClassEx1.MemberInnerClass mic = oce1.new MemberInnerClass();
		mic.print();
	}
}// OuterClassEx1 end
