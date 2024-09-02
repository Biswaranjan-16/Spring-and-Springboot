package in.biswa;

public class Car {
	private IEngine eng;

	public void setEngine(IEngine eng) {
		this.eng = eng;
	}

	public void drive() {
		boolean status = eng.start();

		if (status) {
			System.out.println("engine start");
		} else {
			System.out.println("engine failed");
		}
	}
}
