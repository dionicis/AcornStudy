package d20160521;

public class StringBufferEx {
	public static void main(String[] args) {
		String str = "Hello java World";
		char[] chArr = str.toCharArray();

		for (int i = 0; i < chArr.length; i++)
			System.out.print(chArr[chArr.length - i - 1]);
		System.out.println();
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT EMPNO, ENAME, SAL ");
		sb.append("FROM EMP ");
		sb.append("WHERE EMPNO = 7788");
		
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		System.out.println("=======================");
		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1.reverse());
	}
}
