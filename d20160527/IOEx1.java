package d20160527;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx1 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello.java");
		File f2 = new File("c:\\CopyHello.java");
		// Byte Stream �迭�� ���Ͽ� �д� �ɷ��� �մ� Ŭ����?
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(f2);

		int value = 0;
		while ((value = fis.read()) != -1) {
			// int value = fis.read();// ù������ ASCII�ڵ尪�� ������
			System.out.print((char) value);// byteStream�̱� ������ 2����Ʈ �ѱ��� ������ �����ͼ�
											// ������
			fos.write(value);//�ѱ��� �ȱ�����?
		}

		// outputStream <==�ֻ��� Ŭ����
		// FileOutputStream

	}
}
