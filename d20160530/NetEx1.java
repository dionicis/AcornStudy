package d20160530;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet = InetAddress.getLocalHost();
		String name = inet.getHostName();
		String ip = inet.getHostAddress();
		System.out.println("name : " + name);
		System.out.println("ip : " + ip);

		InetAddress[] inet2 = InetAddress.getAllByName("www.naver.com");
		for(InetAddress ia : inet2)
			System.out.println("네이버 아이피 : " + ia.getHostAddress());
	}
}
