package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetEx3 {
	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(5000);
			Socket client = s.accept();
			System.out.println(client.getInetAddress().getHostAddress());
			InputStream is = client.getInputStream();
			OutputStream os = client.getOutputStream();

			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw);

			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String msg = null;

			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
				pw.println(msg);
				pw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
