package in.Biswa;

public class Car extends Engine {
	
public void drive() {
	
	int status=super.start();
	
	if(status >= 1) {
		
		System.out.println("Journey Started..");
	}else {
		System.out.println("Engine Problem..");
	}
}
}
