package d20160530;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOEx7 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// File f = new File("c:\\member.dat");
		// // ���Ͽ� ������ �� �ִ� �ɷ�
		// FileInputStream fis = new FileInputStream(f);
		// // ���� ��밡��
		// BufferedInputStream bis = new BufferedInputStream(fis);
		// // ��ü ������ ������ �б�
		// ObjectInputStream ois = new ObjectInputStream(bis);
		ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(
								new File("c:\\member.dat"))));
		
		Object obj1 = ois.readObject();
		Object obj2 = ois.readObject();

		Member m1 = (Member) obj1;
		System.out.println("�̸� : " + m1.getName());
		System.out.println("ID : " + m1.getId());
		System.out.println("PW : " + m1.getPw());

		Member m2 = (Member) obj2;
		System.out.println("�̸� : " + m2.getName());
		System.out.println("ID : " + m2.getId());
		System.out.println("PW : " + m2.getPw());
	}
}
