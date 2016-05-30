package d20160525;

public class FloatArray {
	float[] fa;

	public void setArray(float[] fa) {
		this.fa = fa;
	}
	
	public void print(){
		for(float f : fa)
			System.out.println(f);
	}
}
