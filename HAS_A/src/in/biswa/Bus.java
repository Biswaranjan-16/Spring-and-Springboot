package in.biswa;

public class Bus {
	public void drive() {
		Engine eng = new Engine();
		int status = eng.start();

		if (status >= 1) {
			System.out.println("bus start....");
		} else {
			System.out.println("engine failed...");
		}
	}
}
