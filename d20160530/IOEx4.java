package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOEx4 {
	public static void main(String[] args) throws IOException {
		// Ű����κ��� �Է¹ޱ�
		// ctrl + z ������ ���� �ݺ�
		// int val = 0;
		// InputStream <==> Reader
		// InputStreamReader

		File f = new File("c:/saveBuffer.java");
		FileWriter fw = new FileWriter(f);

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = new BufferedWriter(fw);
		String data = null;
		while ((data = br.readLine()) != null) {
			bw.write(data);
		}
		bw.flush();

	}
}
