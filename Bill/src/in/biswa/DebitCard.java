package in.biswa;

public class DebitCard implements IPayment {

	@Override
	public boolean payment(double billamt) {
	System.out.println("debit card");
		return true;
	}

}
