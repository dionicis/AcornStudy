package d20160519;

//oop
//1. ĸ��ȭ(Encapsulation) ==>������ ����
//2. ���(Inheritance)
//3. �߻�ȭ(Abstraction)
//4. ������(Polymorphism)
public class TestMain3 {
	public static void main(String[] args) {
		���� m1 = new ����();
		���� m2 = new ����();
		���� m3 = new ����();
		���� m4 = new ����();

		Horse h1 = new Horse();
		Horse h2 = new Horse();
		Horse h3 = new Horse();
		Horse h4 = new Horse();
		
		//������
		//������ ���۹������ ���۽�Ű����
		//��� ���� �ٸ� ������ �ϰ� �ϴ°�
		
		
		//Flyable f
		//f = h1
		Flyable[] f = {m1,m2,m3,m4,h1,h2,h3,h4};
		
		for(Flyable fy : f)
			fy.fly();

	}
}
