package d20160519;

public class InheritanceObject {
	public void toStringMethod(InheritanceObject obj) {
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println("plus " + obj);
	}

	public void toStringMethod2() {
		System.out.println(this);
		System.out.println(this.toString());
		System.out.println("plus " + this);
	}
	
	@Override
	public String toString(){
		return "InheritanceObject class";
	}

	public static void main(String[] args) {
		InheritanceObject obj = new InheritanceObject();
		obj.toStringMethod2();
	}
}
