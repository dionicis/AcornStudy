package d20160510;

import java.io.IOException;

public class StatementHw11 {
	public static void main(String[] args) throws IOException {

		System.out.print("�Է� : ");
		int input = System.in.read();
		
		if (input >= 65 && input <= 90){
			char ch = (char)(input + 32);
			System.out.println("��� : " + ch);
		}
		else if (input >= 97 && input <= 122){
			char ch = (char)(input - 32);
			System.out.println("��� : " + ch);
		}

	}
}