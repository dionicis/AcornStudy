package d20160516.Hw;

public class �䳢 {
	int		����;
	int		��;
	int		�ٸ�;
	int		��;
	String	�̸�;
	String	����;

	�䳢() {
		���� = 2;
		�� = 2;
		�ٸ� = 4;
		�� = 2;
		�̸� = "�Ϳ��";
		���� = "���";
	}

	�䳢(int age, String name, String color) {
		�� = 2;
		�ٸ� = 4;
		�� = 2;
		���� = age;
		�̸� = name;
		���� = color;
	}

	void Ǯ�Ա�() {
		System.out.println("Ǯ�� �Խ��ϴ�.");
		System.out.println("�ȳȳ�");
	}
	
	void stat(){
		System.out.println("���� : "+����);
		System.out.println("�� : "+��);
		System.out.println("�ٸ� : "+�ٸ�);
		System.out.println("�� : "+��);
		System.out.println("�̸� : "+�̸�);
		System.out.println("���� : "+����);
	}
}
