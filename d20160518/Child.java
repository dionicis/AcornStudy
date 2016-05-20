package d20160518;

public class Child extends Parent{
	String snsId;
	public Child() {
		super();
		snsId = "괴고수";
		System.out.println("Child 클래스의 기본생성자");
	}
	public void 클럽가기(){
		System.out.println("두둠칫");
	}
	
	public void 학교가기(){
		System.out.println("핵교");
	}
	
	//@라고 쓰는걸 annotation이라 함
	@Override //override임을 알리고 컴파일러가 맞는지 틀리는지 알아봐줌
	public void 노래부르기(){
		System.out.println("come'on 넌 is 뭔들");
	}	
}
