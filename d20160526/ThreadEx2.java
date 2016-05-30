package d20160526;

// 1.Runnable 인터페이스 구현
// 2. run() Override
// 3. Thread 클래스의 생성자 (Runnable runnable)
// 4. Thread 클래스의 start() 호출
public class ThreadEx2 implements Runnable {
	String name;

	public ThreadEx2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i < 101; i++)
			System.out.println(this.name + " : " + i);
	}

	public static void main(String[] args) {
		ThreadEx2 te1 = new ThreadEx2("천둥이");
		ThreadEx2 te2 = new ThreadEx2("번개");
		
		Thread th1 = new Thread(te1);
		Thread th2 = new Thread(te2);
		
		th1.start();
		th2.start();
	}
}
