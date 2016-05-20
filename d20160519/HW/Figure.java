package d20160519.HW;

public abstract class Figure {
	int width, height;
	
	Figure(){
		width = 0;
		height = 0;
	}

	public abstract float getCalArea();
}
