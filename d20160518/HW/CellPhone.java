package d20160518.HW;

public class CellPhone extends Phone {
	String	type;
	String	buttonType;

	CellPhone() {
		super();
		type = "Slide";
		buttonType = "analog";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getButtonType() {
		return type;
	}

	public void setButtonType(String type) {
		this.buttonType = type;
	}
}
