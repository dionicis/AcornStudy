package d20160517.HW;

public class FormatData {
	void print(int a){
		System.out.println(a);
	}
	
	void print(int[] b){
		System.out.print("[ ");
		for(int i : b )
			System.out.print(i+" ");
		System.out.print("]\n");
	}
	
	void print(float f){
		System.out.println(f);
	}
}
