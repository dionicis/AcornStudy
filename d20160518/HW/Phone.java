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
			System.out.println("핸드폰을 켭니다.");
		}
		else
			System.out.println("핸드폰을 끕니다.");
	}

	protected void turnOnDisplay() {
		if (!displayOn) {
			displayOn = true;
			System.out.println("화면을 켭니다.");
		}
		else {
			displayOn = false;
			System.out.println("화면을 끕니다.");
		}
	}
	
	protected void sendMessage(){
		System.out.println("메세지를 전송합니다.");
	}
	
	protected void call(){
		System.out.println("전화를 겁니다.");
	}
}
