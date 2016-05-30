package d20160530;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx2 {
	public static void main(String[] args) throws IOException {
		// File f = new File("c:\\Hello.java");
		// File f2 = new File("c:\\SaveHello.java");
		// FileInputStream fis = new FileInputStream(f);
		// FileOutputStream fos = new FileOutputStream(f2);
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(new File("c:\\Hello.java")));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(new File("c:\\SaveHello.java")));

		int v = 0;
		while ((v = bis.read()) != -1) {
			System.out.print((char) v);
			bos.write(v);
		}
		bos.flush();
	}
}
