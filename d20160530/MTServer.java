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
		// ��� Ŭ���̳�Ʈ�� ����� ����ϴ� �ڵ�
		InetAddress inet = client.getInetAddress();
		System.out.println("������ ip : " + inet.getHostAddress());

		// ������ ���Ű�ü
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
		// �߽� ��ü
	}
}
