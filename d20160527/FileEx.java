package d20160527;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello3.java");
		if (f.exists())
			System.out.println("파일 있음");
		else
			f.createNewFile();

		if (f.canRead())
			System.out.println("읽기 가능");

		System.out.println(f.getAbsolutePath());

		System.out.println("=====================");
		File f2 = new File("C:\\Program Files");

		if (f2.isDirectory())
			System.out.println("디렉토리");
		else
			System.out.println("파일");

		String[] fileList = f2.list();// 파일 이름을 string배열로 리턴
		for (String s : fileList)
			System.out.println(s);

		System.out.println("-------------------------");
		File f3 = new File("c:\\CopyHello.java");

		// outputStream <==최상위 클래스
		// FileOutputStream

	}
}
