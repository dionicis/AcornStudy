package d20160518;

public class TestMain3 {
	public static void main(String[] args) {
		마린 m1 = new 마린();
		마린 m2 = new 마린();
		SiegeTank st = new SiegeTank();
		Medic me = new Medic();
		//Ghost gt = new Ghost();
		
		m1.attack(m2);
		m1.attack(st);
		//m1.attack(gt);
		
		me.힐(m1);
	}
}
