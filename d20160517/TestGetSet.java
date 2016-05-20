package d20160517;

public class TestGetSet {
	private int		data;
	private String	str;
	private float	value;
	
	TestGetSet(){
		data = 10;
		str = "";
		value = 4.5f;
	}

	TestGetSet(int data, String str, float value) {
		this.data = data;
		this.str = str;
		this.value = value;
	}
	void setter(int data, String str, float value) {
		this.data = data;
		this.str = str;
		this.value = value;
	}

	int getData() {
		return data;
	}

	String getStr() {
		return str;
	}

	float getValue() {
		return value;
	}
}
