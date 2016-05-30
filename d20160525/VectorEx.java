package d20160525;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector v = new Vector();

		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add("µþ±â");
		v.add("º¹¼þ¾Æ");
		v.add("»ç°ú");
		v.add("Æ÷µµ");
		v.add("¹è");
		v.add("µþ±â");
		v.add("µþ±â");
		v.add("µþ±â");
		v.add("µþ±â");
		v.add("µþ±â");
		v.add("µþ±â");
		// vector : µ¿Àû ¼ºÀåÇü Object ¹è¿­
		// °´Ã¼ Çüº¯È¯

		for (int i = 0; i < v.size(); i++) {
			Object obj = v.get(i);
			String str = (String) obj;
			System.out.println(str.substring(0, 1));
		}
	}
}
