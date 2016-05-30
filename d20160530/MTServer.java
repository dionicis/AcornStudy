package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class MTServer extends Thread {
	Socket client;

	public MTServer(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		// 모든 클라이너트와 통신을 담당하는 코드
		InetAddress inet = client.getInetAddress();
		System.out.println("접속자 ip : " + inet.getHostAddress());

		// 서버의 수신객체
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
			PrintWriter pw = new PrintWriter(new BufferedWriter(
					new OutputStreamWriter(client.getOutputStream())));

			String msg = null;
			String ip = inet.getHostAddress();
			while ((msg = br.readLine()) != null) {
				System.out.println("[" + ip + "] : " + msg);
				pw.println("[" + ip + "] : " + msg);
				pw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 발신 객체
	}
}
