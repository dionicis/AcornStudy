package d20160525;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();

		hs.add("�Ե�");
		hs.add("�ʹ�");
		hs.add("���ӳø�");
		hs.add("�ø�");
		hs.add("���");
		hs.add("�ʹ�");
		hs.add("�ʹ�");
		hs.add("�ʹ�");
		hs.add("�ʹ�");
		hs.add("�ʹ�");
		hs.add("�ʹ�");
		hs.add("�ʹ�");
		hs.add("�ʹ�");
		hs.add("�ʹ�");

		System.out.println(hs.size());

		System.out.println("hs : " + hs);

		// Ȱ���
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}

	}
}
