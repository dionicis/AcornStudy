package d20160525;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector v = new Vector();

		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add("����");
		v.add("������");
		v.add("���");
		v.add("����");
		v.add("��");
		v.add("����");
		v.add("����");
		v.add("����");
		v.add("����");
		v.add("����");
		v.add("����");
		// vector : ���� ������ Object �迭
		// ��ü ����ȯ

		for (int i = 0; i < v.size(); i++) {
			Object obj = v.get(i);
			String str = (String) obj;
			System.out.println(str.substring(0, 1));
		}
	}
}
