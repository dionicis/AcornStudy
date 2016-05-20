package d20160519.HW;

public class Rectangle extends Figure {
	private int width, height;

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public float getCalArea() {
		return (float) (width * height);
	}
}
