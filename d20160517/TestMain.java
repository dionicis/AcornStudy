package d20160517;

public class TestMain {
	public static void main(String[] args) {
		// Medic medic1 = new Medic();
		// Medic medic2 = new Medic(60,50,"�޵�");
		// medic1.��������();
		// medic2.��������();
		// medic1.��();

		���� m1 = new ����();
		���� m2 = new ����();
//		//m1 = m2;
//		//medic = m1; �ȴ� Ŭ������ �޶�
//		m2 = m1;
//		m1.hp = 50;
//		System.out.println(m2.hp);
		System.out.println("������ m2 ����");
		m2.state();
		
		m1.attack(m2);
//		m2.attack(m1);
		
//		m1.state();
		System.out.println("������ m2 ����");
		m2.state();
		
		//������ �޵��� ����
		Medic m = new Medic();
		
		//������ũ ��ü�� �����ϰ�
		//�� ��ũ�� ������ ������ũ�� �����Ҽ� �ְ� Ŭ������ �ۼ��ϼ���.
		
		TestGetSet test = new TestGetSet();
		test.setter(1, "��ī��", 25);
		int result = test.getData();
		System.out.println(result);
		
	}
}
