package d20160518;

public class TestMain3 {
	public static void main(String[] args) {
		���� m1 = new ����();
		���� m2 = new ����();
		SiegeTank st = new SiegeTank();
		Medic me = new Medic();
		//Ghost gt = new Ghost();
		
		m1.attack(m2);
		m1.attack(st);
		//m1.attack(gt);
		
		me.��(m1);
	}
}
