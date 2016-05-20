package d20160519;

public class SmartPhone {
	String	os;
	String	전화번호;
	static String	제조사;
	String	통신망;
	String	시리얼번호;
	String	기기명;
	int		유심번호;
	
	public SmartPhone(){
		제조사 = "엘쮜";
	}

	public SmartPhone(String os, String 전화번호, String 제조사, String 통신망, String 시리얼번호, String 기기명, int 유심번호) {
		super();
		this.os = os;
		this.전화번호 = 전화번호;
		this.제조사 = 제조사;
		this.통신망 = 통신망;
		this.시리얼번호 = 시리얼번호;
		this.기기명 = 기기명;
		this.유심번호 = 유심번호;
	}


	public void 전화걸기(String 전화번호) {
		System.out.println("-----------");
		System.out.println(전화번호 + "로 거는중 ....");
	}

	public void 전화받기() {
		System.out.println("전화와씀");
	}

	public void game() {
		System.out.println("게임을 해여");
	}

	public void getApp() {
		System.out.println("어플 받기");
	}
}
