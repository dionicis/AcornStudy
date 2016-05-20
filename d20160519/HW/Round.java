package d20160519.HW;

public class Round extends Figure {
	private int r;
	private float PI = 3.14f;
	
	Round(){
		r = 0;
	}
	
	public void setRadius(int r){
		this.r = r;
	}
	
	public int getRadius(){
		return r;
	}
	
	public float getCalArea(){
		return (float)(r*r*PI);
	}
}
