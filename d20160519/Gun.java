package d20160519;

public class Gun implements Weapon {

	int	MAX_BULLET	= 8;
	int	bullet;

	Gun() {
		bullet = 8;
	}

	@Override
	public void use() {
		if (bullet > 0) {
			System.out.println("BOOM");
			bullet -= 1;
		}
		else
			System.out.println("Æ½");
	}

	@Override
	public void reuse() {
		System.out.println("Reload");
		bullet = 8;
	}

	@Override
	public void drop() {
		System.out.println("ÃÑÀ» ¹ö¸°´Ù.");
	}
}
