package d20160530;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(5000);
			while (true) {// ���ѹݺ�
				System.out.println("Ŭ���̾�Ʈ ���� �����");
				Socket client = ss.accept();
				MTServer ms = new MTServer(client);
				ms.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
