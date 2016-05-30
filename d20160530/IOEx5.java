package d20160530;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx5 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\saveData.sav");
		// �������� : FileOutputStream
		// ������ ���� : BufferedOutputStream
		// �⺻ �ڷ��� �����͸� ���� : DataOutputStream
		FileOutputStream fos = new FileOutputStream(f);
		FileInputStream fis = new FileInputStream(f);

		BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedInputStream bis = new BufferedInputStream(fis);

		DataOutputStream dos = new DataOutputStream(bos);
		DataInputStream dis = new DataInputStream(bis);

		dos.writeUTF("����");// ĳ���͸�
		dos.writeInt(10);// ����
		dos.writeLong(321654987);// ����ġ
		dos.writeBoolean(true);// ���� :�� ��
		dos.writeByte(21);// �ֹ��� ��ȣ
		dos.flush();

		// ������� �о�;���
		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readBoolean() ? "��" : "��");
		System.out.println(dis.readByte());
	}
}
