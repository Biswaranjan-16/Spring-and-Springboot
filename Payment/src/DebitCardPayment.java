
public class DebitCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Debit card payment is successfull.....");
		return true;
	}

}
