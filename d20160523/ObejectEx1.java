package d20160523;
// 자바에서 생략 가능한 것?

// 1. import java.lang.*
// 2. extends Object 생략 가능
// 3. 기본 생성자 (다른 매개변수 있는 생성자가 없을 경우)
// 멤버변수의 값을 기본값, 숫자 0 참조값 null
// 4. 멤버변수를 가르키는 참조 변수 : this
// 5. super
// 6. super();
// 7. 접근지정자 default

import d20160518.마린;

public class ObejectEx1{
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		obj1 = obj2;
		obj1.toString();
		if (obj1 == obj2) {//주소값 비교??
			System.out.println("동일객체");
		}
		else{
			System.out.println("다른객체");
		}
		
		System.out.println("==========================");
		if (obj1.equals(obj2)) {//주소값 비교??
			System.out.println("동일객체");
		}
		else{
			System.out.println("다른객체");
		}
		
		System.out.println("========================");
		Class cls = obj1.getClass();
		System.out.println("클래스명 : " + cls.getName());//클래스 이름을 가져옴
		
		//Object클래스의 instance변수인가요?
		System.out.println(obj1 instanceof Object);
		
		마린 marin = new 마린();
		System.out.println(obj1 instanceof 마린);
		
		System.out.println("obj2참조값 : "+ obj2);
		System.out.println("obj2.toString() : "+obj2.toString());
		
		System.out.println("obj2.toString() : "+obj2.getClass().getName() + '@'+ Integer.toHexString(obj2.hashCode()));
	}
}
