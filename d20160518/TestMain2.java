package d20160518;

public class TestMain2 {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println("==========================");
		Child c = new Child();
		c.�ܼҸ�();
		c.Ŭ������();
		c.�뷡�θ���();

		p.�뷡�θ���();
		
		Child c2;
		Parent p1 = new Child();
		c2 = (Child) p1;
		c2.Ŭ������();
		
	}
}
