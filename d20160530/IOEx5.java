package d20160530;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx5 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\saveData.sav");
		// 파일접근 : FileOutputStream
		// 빠르게 저장 : BufferedOutputStream
		// 기본 자료형 데이터를 저장 : DataOutputStream
		FileOutputStream fos = new FileOutputStream(f);
		FileInputStream fis = new FileInputStream(f);

		BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedInputStream bis = new BufferedInputStream(fis);

		DataOutputStream dos = new DataOutputStream(bos);
		DataInputStream dis = new DataInputStream(bis);

		dos.writeUTF("루피");// 캐릭터명
		dos.writeInt(10);// 레벨
		dos.writeLong(321654987);// 경험치
		dos.writeBoolean(true);// 성별 :남 여
		dos.writeByte(21);// 주무기 번호
		dos.flush();

		// 순서대로 읽어와야함
		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readBoolean() ? "남" : "여");
		System.out.println(dis.readByte());
	}
}
