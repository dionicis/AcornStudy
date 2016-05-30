package d20160527;

import java.util.ArrayList;
import java.util.Random;

public class Car {
	ArrayList<String>	list;
	String[]			carName	= { "아우디", "벤츠", "붕붕이", "타요", "람보르기니", "BMW", "현대", "벤틀리", "폭스바겐" };

	Car() {
		list = new ArrayList<String>();
	}

	public synchronized void push(String car) {
		System.out.println("자동차가 생산되었습니다 " + car);
		list.add(car);
		//기다리고 잇는 호갱님 일어나세요
		notifyAll();
		System.out.println("차고 상태 : " + list);
	}

	public synchronized String pop() {
		if (list.size() == 0) {
			System.out.println("호갱님 기다리세영");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String carName = list.remove(list.size() - 1);
		System.out.println("출고합니다 : " + carName);
		return carName;
	}

	public synchronized String getCar() {
		// 랜덤하게 차량이름 얻어오기
		Random rnd = new Random();
		return carName[rnd.nextInt(carName.length)];
	}
}
