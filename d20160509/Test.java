package d20160509;

public class Test {
	// main method : start point of java application
	public static void main(String[] args) {
		// ���� ���
		// �ڷ��� ������ = ���;
		char ch1 = 'a'; //ch1��� char�� ������ ���� 'a'�� ����
		char ch2 = 97; //ch2��� char�� ������ ASCII �ڵ尪 97�� ����
		char ch3 = '\u0061'; //ch3��� char�� ������ �����ڵ尪 \u0061�� ����

		System.out.println("���ڿ� : " + ch1); //ch1���
		System.out.println("���ڿ� : " + ch2); //ch2���
		System.out.println("���ڿ� : " + ch3); //ch3���
		
		//char ch4 = "a"; �ȴ�
		//char ch5 = 'ab'; �ȴ�
		
		char ch6 = '\n'; //enter
		char ch7 = '\t'; //tab
		char ch8 = '\b'; //backspace
		char ch9 = '\''; //Ư������ '
		//Ư�� ���� \n \t \b \' \" \\
		
		
		System.out.println("������"+"������"); //������������
		System.out.println("������"+ch6+"������"); //������ (������)������
		System.out.println("������"+ch7+"������"); //������ (��)������
		System.out.println("������"+ch8+"������"); //������ (�齺���̽�)
		System.out.println("������"+ch9+"������"); //������ '������

		
	}// main end
}// class end
