package d20160526;
// Thread : ���μ��������� ����Ǵ� �帧�� ����

// �ڹٴ� ��Ƽ�½�ũ, multi-Thread�� ������
// Multi-Thread
// 1. Thread ��� ==1. ���
// ==2. run() Override
// ==3. start() ȣ��

// 2. Runnable Interface�� ����
public class ThreadEx1 extends Thread {

	public ThreadEx1(String name) {
		// super(); �θ� �⺻�����ڸ� ȣ��
		// �θ� String �Ű������� ���� �����ڸ� ȣ��

		super(name); // ���� �����忡 �̸��� �ο�
	}

	@Override
	public void run() {
		// ���ÿ� ó���ϰ��� �ϴ� ����
		// ���� �������� �������� �̸�
		Thread th = Thread.currentThread();
		String name = th.getName();

		for (int i = 1; i <= 100; i++)
			System.out.println(name + " : " + i+"���� �޸�����");

	}

	public static void main(String[] args) {
		ThreadEx1 th1 = new ThreadEx1("õ����");
		ThreadEx1 th2 = new ThreadEx1("����");
		System.out.println("�غ�");
		th1.start();
		th2.start();
		System.out.println("��");
	}
}
