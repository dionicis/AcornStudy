package d20160516;

public class TestMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		//Ŭ������ �������� = new ������();
		
		//������ : ��ü�� �ʱ�ȭ�� �������� ��� ������ �ʱⰪ�� �������ִ�
		//Ư���� �ɷ��� �ִ� �޼���
		
		//Ŭ������� ������ �̸��� ������ �ִ� method
		//��ü ������ 1ȸ�� ����Ǵ� method
		Person p2 = new Person();
		Person p3 = new Person();

		p1.���� = 24;
		p1.���� = "����";
		p1.�̸� = "������";
		p1.������ = "B";
		p1.Ű = 179.9f;
		p1.������ = 50.0f;

		p2.���� = 28;
		p2.���� = "����";
		p2.�̸� = "��ö��";
		p2.������ = "A";
		p2.Ű = 179.9f;
		p2.������ = 69.0f;

		System.out.println(p3.�̸�);
		p1.profile();
		p2.profile();
		p3.profile();
	}
}
