package d20160525;

import java.util.ArrayList;

public class ArrayListEx3 {
	public static void main(String[] args) {
		//String객체만 담을 수 있는 전용 동적 성장형 배열
		//객체면 뭐든지 가능
		//제너릭(일반화)한다고 함
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list.add("딸기");
		int a = 30;
//		Integer it = a;
//		list.add(it);
		list.add("우유");
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			String str = (String) obj;
			System.out.println(str.substring(0, 1));

		}

	}
}
