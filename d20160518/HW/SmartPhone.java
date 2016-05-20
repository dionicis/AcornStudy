package d20160518.HW;

public class SmartPhone extends Phone {
	String	OS;
	int		installedApp;

	SmartPhone() {
		super();
		OS = "Android";
		installedApp = 5;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public int getInstalledApp() {
		return installedApp;
	}

	public void setInstalledApp(int installedApp) {
		this.installedApp = installedApp;
	}
}
