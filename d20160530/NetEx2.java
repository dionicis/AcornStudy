package d20160530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetEx2 {
	public static void main(String[] args) {
		// socket
		// Ŭ���̾�Ʈ ���� : socket
		try {
			Socket s = new Socket("192.168.0.41", 5000);
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			// os.write(97);

			InputStreamReader isr2 = new InputStreamReader(is);
			BufferedReader br2 = new BufferedReader(isr2);

			InputStreamReader isr = new InputStreamReader(System.in);
			OutputStreamWriter osw = new OutputStreamWriter(os);

			BufferedReader br = new BufferedReader(isr);
			// BufferedWriter bw = new BufferedWriter(osw);

			PrintWriter pw = new PrintWriter(osw);

			String data = null;
			while ((data = br.readLine()) != null) {
				// ���
				pw.println(data);
				pw.flush();
				String msg = br2.readLine();
				System.out.println("������ ������ �� : " + msg);
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
