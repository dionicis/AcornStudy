package d20160523;
// �ڹٿ��� ���� ������ ��?

// 1. import java.lang.*
// 2. extends Object ���� ����
// 3. �⺻ ������ (�ٸ� �Ű����� �ִ� �����ڰ� ���� ���)
// ��������� ���� �⺻��, ���� 0 ������ null
// 4. ��������� ����Ű�� ���� ���� : this
// 5. super
// 6. super();
// 7. ���������� default

import d20160518.����;

public class ObejectEx1{
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		obj1 = obj2;
		obj1.toString();
		if (obj1 == obj2) {//�ּҰ� ��??
			System.out.println("���ϰ�ü");
		}
		else{
			System.out.println("�ٸ���ü");
		}
		
		System.out.println("==========================");
		if (obj1.equals(obj2)) {//�ּҰ� ��??
			System.out.println("���ϰ�ü");
		}
		else{
			System.out.println("�ٸ���ü");
		}
		
		System.out.println("========================");
		Class cls = obj1.getClass();
		System.out.println("Ŭ������ : " + cls.getName());//Ŭ���� �̸��� ������
		
		//ObjectŬ������ instance�����ΰ���?
		System.out.println(obj1 instanceof Object);
		
		���� marin = new ����();
		System.out.println(obj1 instanceof ����);
		
		System.out.println("obj2������ : "+ obj2);
		System.out.println("obj2.toString() : "+obj2.toString());
		
		System.out.println("obj2.toString() : "+obj2.getClass().getName() + '@'+ Integer.toHexString(obj2.hashCode()));
	}
}
