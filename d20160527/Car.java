package d20160527;

import java.util.ArrayList;
import java.util.Random;

public class Car {
	ArrayList<String>	list;
	String[]			carName	= { "�ƿ��", "����", "�غ���", "Ÿ��", "���������", "BMW", "����", "��Ʋ��", "�����ٰ�" };

	Car() {
		list = new ArrayList<String>();
	}

	public synchronized void push(String car) {
		System.out.println("�ڵ����� ����Ǿ����ϴ� " + car);
		list.add(car);
		//��ٸ��� �մ� ȣ���� �Ͼ����
		notifyAll();
		System.out.println("���� ���� : " + list);
	}

	public synchronized String pop() {
		if (list.size() == 0) {
			System.out.println("ȣ���� ��ٸ�����");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String carName = list.remove(list.size() - 1);
		System.out.println("����մϴ� : " + carName);
		return carName;
	}

	public synchronized String getCar() {
		// �����ϰ� �����̸� ������
		Random rnd = new Random();
		return carName[rnd.nextInt(carName.length)];
	}
}
