package d20160525;

public class IntArray {
	int[] intArr;

	public void setArray(int[] intArr) {
		this.intArr = intArr;
	}
	
	public void print(){
		for(int i : intArr)
			System.out.println(i);
	}
}
