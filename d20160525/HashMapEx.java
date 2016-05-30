package d20160525;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("반장", "은주띠");
		hm.put("부반장", "사라진 그사람");
		hm.put("실", "바늘");
		hm.put("파전", "막걸리");
		hm.put("치킨", "맥주"); // key값은 중복 안댐
		hm.put("치킨", "쏘주");
		hm.put("치킨", "쏘콜");
		hm.put("감튀", "맥주");
		System.out.println(hm);

		String data = hm.get("파전");
		System.out.println(data);

		// 키 얻어오기
		Set key = hm.keySet();// set으로 변경
		Iterator<String> it = key.iterator();// set을 iterator로 변경하여 담음
		while (it.hasNext()) {
			String val = it.next();
			System.out.println("key : " + val + " value : " + hm.get(val));
		}
	}
}
