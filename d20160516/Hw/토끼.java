package d20160516.Hw;

public class Åä³¢ {
	int		³ªÀÌ;
	int		±Í;
	int		´Ù¸®;
	int		´«;
	String	ÀÌ¸§;
	String	»ö±ò;

	Åä³¢() {
		³ªÀÌ = 2;
		±Í = 2;
		´Ù¸® = 4;
		´« = 2;
		ÀÌ¸§ = "±Í¿ä¹Ì";
		»ö±ò = "Èò»ö";
	}

	Åä³¢(int age, String name, String color) {
		±Í = 2;
		´Ù¸® = 4;
		´« = 2;
		³ªÀÌ = age;
		ÀÌ¸§ = name;
		»ö±ò = color;
	}

	void Ç®¸Ô±â() {
		System.out.println("Ç®À» ¸Ô½À´Ï´Ù.");
		System.out.println("³È³È³È");
	}
	
	void stat(){
		System.out.println("³ªÀÌ : "+³ªÀÌ);
		System.out.println("±Í : "+±Í);
		System.out.println("´Ù¸® : "+´Ù¸®);
		System.out.println("´« : "+´«);
		System.out.println("ÀÌ¸§ : "+ÀÌ¸§);
		System.out.println("»ö±ò : "+»ö±ò);
	}
}
