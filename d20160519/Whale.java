package d20160519;

public class Whale extends Mammalia{
	int		fin;
	String	gender;

	Whale() {
		fin = 1;
		gender = "����";
	}
	
	@Override
	void eat() {
		System.out.println("����Ա�");
	}

	@Override
	void sleep() {
		System.out.println("����");
	}

	void swimming() {
		System.out.println("��Ǫ��Ǫ");
	}
}
