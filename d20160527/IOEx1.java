package d20160527;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx1 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello.java");
		File f2 = new File("c:\\CopyHello.java");
		// Byte Stream 계열에 파일에 읽는 능력이 잇는 클래스?
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(f2);

		int value = 0;
		while ((value = fis.read()) != -1) {
			// int value = fis.read();// 첫글자의 ASCII코드값을 가져옴
			System.out.print((char) value);// byteStream이기 때문에 2바이트 한글이 나눠서 가져와서
											// 에러임
			fos.write(value);//한글이 안깨진다?
		}

		// outputStream <==최상위 클래스
		// FileOutputStream

	}
}
