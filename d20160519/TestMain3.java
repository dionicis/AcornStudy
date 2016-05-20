package d20160519;

//oop
//1. 캡슐화(Encapsulation) ==>정보의 은닉
//2. 상속(Inheritance)
//3. 추상화(Abstraction)
//4. 다형성(Polymorphism)
public class TestMain3 {
	public static void main(String[] args) {
		마린 m1 = new 마린();
		마린 m2 = new 마린();
		마린 m3 = new 마린();
		마린 m4 = new 마린();

		Horse h1 = new Horse();
		Horse h2 = new Horse();
		Horse h3 = new Horse();
		Horse h4 = new Horse();
		
		//다형성
		//동일한 조작방법으로 동작시키지만
		//대상에 따라 다른 실행을 하게 하는것
		
		
		//Flyable f
		//f = h1
		Flyable[] f = {m1,m2,m3,m4,h1,h2,h3,h4};
		
		for(Flyable fy : f)
			fy.fly();

	}
}
