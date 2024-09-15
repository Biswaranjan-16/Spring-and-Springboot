package in.biswa;

public class PetrolEngine implements IEngine{
@Override
public boolean start() {
	System.out.println("petrol engine start");
	return true;
}
}
