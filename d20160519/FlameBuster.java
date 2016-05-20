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
			System.out.println("푸슉");
	}

	@Override
	public void reuse() {
		System.out.println("연료를 채웁니다.");
		fuel = 100;
	}

	@Override
	public void drop() {
		System.out.println("화염방사기 버립니다.");
	}
	
	public void disamble(){
		System.out.println("분해합니다.");
	}

}
