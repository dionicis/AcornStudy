package d20160530;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOEx6 {
	public static void main(String[] args) throws IOException {
		Member m1 = new Member(1, "ȫ�浿", "Hong", "gildong", "010-5473-8715");
		Member m2 = new Member(2, "ȫ�Ǽ�", "Hong", "papa", "010-5552-8715");
		File f = new File("c:\\member.dat");
		// File�� ������ �� �ִ� �ɷ� Ŭ����
		FileOutputStream fos = new FileOutputStream(f);
		// ����?
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// ��ü ����
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(m1);
		oos.writeObject(m2);
		oos.flush();
	}
}
