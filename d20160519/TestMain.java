package d20160519;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("==============");
		Rabbit r = new Rabbit();
		Whale w = new Whale();
		Squirrel s = new Squirrel();
		// Mammalia m = new Rabbit(); °¡´É

		System.out.println("------Åä³¢------");
		r.eat();
		r.sleep();
		r.jump();
		System.out.println("------°í·¡------");
		w.eat();
		w.sleep();
		w.swimming();
		System.out.println("-----´Ù¶÷Áã------");
		s.eat();
		s.sleep();
		s.climb();

		System.out.println("---------------");
		Horse h = new Horse();
		h.eat();
		h.sleep();
		h.run();
	}

}
