package d20160516;

public class test {
	public static void main(String[] args) {
		Car car = new Car();// new는 객체 동적 할당 연산자.
		Car car2 = new Car();

		car.start();
		System.out.println(car.wheel);
		System.out.println(car);

		// Car2의 엔진 몇개?
		System.out.println(car2.engine);

		car.carName = "아반테"; // 인스턴스 변수
		car2.carName = "소나타";

		System.out.println("car : " + car.carName + " car2 : " + car2.carName);

		car.wheel = 4;
		car.handle = 1;
		car.window = 4;
		car.engine = 500;
		car.madeBy = "HYUDAI";
		
		car2.wheel = 4;
		car2.handle = 1;
		car2.window = 4;
		car2.engine = 500;
		car.madeBy = "HYUNDAI";
		

	}
}
