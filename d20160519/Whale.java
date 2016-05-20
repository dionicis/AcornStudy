package d20160519;

public class Whale extends Mammalia{
	int		fin;
	String	gender;

	Whale() {
		fin = 1;
		gender = "¼öÄÆ";
	}
	
	@Override
	void eat() {
		System.out.println("»õ¿ì¸Ô±â");
	}

	@Override
	void sleep() {
		System.out.println("ÄğÄğ");
	}

	void swimming() {
		System.out.println("¾îÇª¾îÇª");
	}
}
