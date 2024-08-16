
public class AmexPayment implements IPayment{

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Amex payment is successfull.....");
		return true;
	}

}
