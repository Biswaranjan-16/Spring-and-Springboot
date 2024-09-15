package in.biswa;

public class CreditCard implements IPayment{

	@Override
	public boolean payment(double billamt) {
		System.out.println("credit card");
		return true;
	}
          
}
