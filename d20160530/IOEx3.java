package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx3 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello.java");
		File f2 = new File("c:/HelloTest.java");

		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(f2);

		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);

		String data = null;
		while ((data = br.readLine()) != null) {
			bw.write(data + "\n");
		}
		bw.flush();

	}
}
