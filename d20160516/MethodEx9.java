package d20160516;

public class MethodEx9 {

	static String mergeWord(String... strings) {
		String result = new String();
		// ���� for ��, ������ for ��
		for (String s : strings)
			result += s;
		return result;
	}
	

	public static void main(String[] args) {
		String str = mergeWord("������", "������");
		System.out.println("str = " + str);
		System.out.println(mergeWord("����", "�α�", "����"));
		System.out.println(mergeWord("�ڹ�", "����", "�μ�", "�޼���"));
	}
}
