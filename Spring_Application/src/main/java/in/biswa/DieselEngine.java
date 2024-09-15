package in.biswa;

public class DieselEngine implements IEngine{

	@Override
	public boolean start() {
		System.out.println("diesel engine start");
		return true;
	}

}
