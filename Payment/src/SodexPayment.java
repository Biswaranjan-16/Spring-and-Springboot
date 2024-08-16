
public class SodexPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Sodex payment is successfull.....");
		return true;
	}

}
