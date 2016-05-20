package d20160519;

public class FlameBuster implements Weapon {
	int fuel;

	FlameBuster() {
		fuel = 100;
	}

	@Override
	public void use() {
		if (fuel > 0) {
			System.out.println("Burn~");
			fuel -= 10;
		}
		else
			System.out.println("Ǫ��");
	}

	@Override
	public void reuse() {
		System.out.println("���Ḧ ä��ϴ�.");
		fuel = 100;
	}

	@Override
	public void drop() {
		System.out.println("ȭ������ �����ϴ�.");
	}
	
	public void disamble(){
		System.out.println("�����մϴ�.");
	}

}
