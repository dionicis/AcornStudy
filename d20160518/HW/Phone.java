package d20160518.HW;

public class Phone {
	private String	number;
	private String	madeBy;
	private String	network;
	private boolean	systemOn;
	private boolean	displayOn;

	public Phone() {
		this.number = "01000000000";
		this.madeBy = "SamSung";
		this.network = null;
		systemOn = false;
		displayOn = false;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	protected void setPhone(String number, String madeBy, String network) {
		this.number = number;
		this.madeBy = madeBy;
		this.network = network;
	}

	protected void turnOnSystem() {
		if (!systemOn) {
			systemOn = true;
			System.out.println("�ڵ����� �մϴ�.");
		}
		else
			System.out.println("�ڵ����� ���ϴ�.");
	}

	protected void turnOnDisplay() {
		if (!displayOn) {
			displayOn = true;
			System.out.println("ȭ���� �մϴ�.");
		}
		else {
			displayOn = false;
			System.out.println("ȭ���� ���ϴ�.");
		}
	}
	
	protected void sendMessage(){
		System.out.println("�޼����� �����մϴ�.");
	}
	
	protected void call(){
		System.out.println("��ȭ�� �̴ϴ�.");
	}
}
