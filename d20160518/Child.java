package d20160518;

public class Child extends Parent{
	String snsId;
	public Child() {
		super();
		snsId = "�����";
		System.out.println("Child Ŭ������ �⺻������");
	}
	public void Ŭ������(){
		System.out.println("�ε�ĩ");
	}
	
	public void �б�����(){
		System.out.println("�ٱ�");
	}
	
	//@��� ���°� annotation�̶� ��
	@Override //override���� �˸��� �����Ϸ��� �´��� Ʋ������ �˾ƺ���
	public void �뷡�θ���(){
		System.out.println("come'on �� is ����");
	}	
}
