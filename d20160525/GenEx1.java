package d20160525;

//��Ȯ�� Ÿ�� : T
//<>�� �ڷ����� ���� �ȴٰ� ǥ������ ->����� Ư���� �Ϲ�ȭ
//generic : �ڷ����� �����Ͻÿ� �����Ѵ� ���� �ƴ϶�
//Runtime �������� �����ϵ��� �Ϲ�ȭ ���״�.
//���������� ���ϰ� �ϱ� ���ؼ�
public class GenEx1<T> {
	T[] str; //String�迭 �������� str ����.

	public void setArray(T[] str) { // T�迭�� �Ű������� �޴� �޼ҵ� ����
		this.str = str;// �Ű����� str�� Ŭ���� ��� ���� str�� ����
	}

	public void print() {// str�� ��Ҹ� ����ϴ� �޼ҵ�
		for (T s : str)
			System.out.println(s);// str�� ��Ҹ� ���
	}
}
