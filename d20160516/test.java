package d20160516;

public class test {
	public static void main(String[] args) {
		Car car = new Car();// new�� ��ü ���� �Ҵ� ������.
		Car car2 = new Car();

		car.start();
		System.out.println(car.wheel);
		System.out.println(car);

		// Car2�� ���� �?
		System.out.println(car2.engine);

		car.carName = "�ƹ���"; // �ν��Ͻ� ����
		car2.carName = "�ҳ�Ÿ";

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
