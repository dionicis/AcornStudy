package d20160527;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello3.java");
		if (f.exists())
			System.out.println("���� ����");
		else
			f.createNewFile();

		if (f.canRead())
			System.out.println("�б� ����");

		System.out.println(f.getAbsolutePath());

		System.out.println("=====================");
		File f2 = new File("C:\\Program Files");

		if (f2.isDirectory())
			System.out.println("���丮");
		else
			System.out.println("����");

		String[] fileList = f2.list();// ���� �̸��� string�迭�� ����
		for (String s : fileList)
			System.out.println(s);

		System.out.println("-------------------------");
		File f3 = new File("c:\\CopyHello.java");

		// outputStream <==�ֻ��� Ŭ����
		// FileOutputStream

	}
}
