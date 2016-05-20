package d20160518.HW;

public class DarkTempler extends Protoss {
	boolean darkArcon;
	
	DarkTempler(){
		hp = 150;
		atk = 20;
		atkSpeed = 3;
		moveSpeed = 4;
		def = 2;
		range = 1;
		cost = 175;
		darkArcon = false;
	}
	
	public void makeArcon(){
		if(!darkArcon)
			System.out.println("다크아콘을 생성합니다.");
	}
}
