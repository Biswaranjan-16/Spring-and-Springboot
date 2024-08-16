
public class CreditCardPayment implements IPayment{

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Credit card payment is successfull.....");
		return true;
	}

}
