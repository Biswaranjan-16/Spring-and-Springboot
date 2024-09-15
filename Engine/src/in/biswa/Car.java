package in.biswa;

public class Car extends Engine {
public void drive() {
	int status=super.start();
	
	if(status>=1) {
		System.out.println("journey start....");
	}else {
		System.out.println("engine not start....");
	}
}
}
