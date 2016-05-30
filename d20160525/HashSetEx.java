package d20160525;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();

		hs.add("±‘µø");
		hs.add("√ π‰");
		hs.add("¿∞Ω”≥√∏È");
		hs.add("≥√∏È");
		hs.add("±Ëπ‰");
		hs.add("√ π‰");
		hs.add("√ π‰");
		hs.add("√ π‰");
		hs.add("√ π‰");
		hs.add("√ π‰");
		hs.add("√ π‰");
		hs.add("√ π‰");
		hs.add("√ π‰");
		hs.add("√ π‰");

		System.out.println(hs.size());

		System.out.println("hs : " + hs);

		// »∞øÎπ˝
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}

	}
}
