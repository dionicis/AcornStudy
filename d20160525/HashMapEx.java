package d20160525;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("����", "���ֶ�");
		hm.put("�ι���", "����� �׻��");
		hm.put("��", "�ٴ�");
		hm.put("����", "���ɸ�");
		hm.put("ġŲ", "����"); // key���� �ߺ� �ȴ�
		hm.put("ġŲ", "����");
		hm.put("ġŲ", "����");
		hm.put("��Ƣ", "����");
		System.out.println(hm);

		String data = hm.get("����");
		System.out.println(data);

		// Ű ������
		Set key = hm.keySet();// set���� ����
		Iterator<String> it = key.iterator();// set�� iterator�� �����Ͽ� ����
		while (it.hasNext()) {
			String val = it.next();
			System.out.println("key : " + val + " value : " + hm.get(val));
		}
	}
}
