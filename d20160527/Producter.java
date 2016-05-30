package d20160527;

public class Producter implements Runnable {
	private Car car;

	public Producter(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 60; i++) {
			car.push(car.getCar());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}		
	}
}
