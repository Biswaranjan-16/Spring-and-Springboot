package in.biswa;

public class Bus {
	private IEngine eng;

	public Bus(IEngine eng) {
		this.eng = eng;
	}
	
	public void start() {
		int status=eng.start();
		
		if(status>=1) {
			System.out.println("engine start...");
		}else {
			System.out.println("engine failed....");
		}
	}
}
