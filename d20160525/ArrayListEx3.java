package d20160525;

import java.util.ArrayList;

public class ArrayListEx3 {
	public static void main(String[] args) {
		//String��ü�� ���� �� �ִ� ���� ���� ������ �迭
		//��ü�� ������ ����
		//���ʸ�(�Ϲ�ȭ)�Ѵٰ� ��
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list.add("����");
		int a = 30;
//		Integer it = a;
//		list.add(it);
		list.add("����");
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			String str = (String) obj;
			System.out.println(str.substring(0, 1));

		}

	}
}
