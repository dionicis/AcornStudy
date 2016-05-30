package d20160530;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOEx6 {
	public static void main(String[] args) throws IOException {
		Member m1 = new Member(1, "홍길동", "Hong", "gildong", "010-5473-8715");
		Member m2 = new Member(2, "홍판서", "Hong", "papa", "010-5552-8715");
		File f = new File("c:\\member.dat");
		// File에 접근할 수 있는 능력 클래스
		FileOutputStream fos = new FileOutputStream(f);
		// 버퍼?
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 객체 저장
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(m1);
		oos.writeObject(m2);
		oos.flush();
	}
}
