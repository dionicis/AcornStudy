package d20160518;

public class TestMain2 {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println("==========================");
		Child c = new Child();
		c.잔소리();
		c.클럽가기();
		c.노래부르기();

		p.노래부르기();
		
		Child c2;
		Parent p1 = new Child();
		c2 = (Child) p1;
		c2.클럽가기();
		
	}
}
