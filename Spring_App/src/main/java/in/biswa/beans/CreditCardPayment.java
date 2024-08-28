package in.biswa.beans;

public class CreditCardPayment implements IPayment{
public CreditCardPayment() {
	System.out.println("creditcard :: constructor");
}
	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Credit Card Payment successfull...");
		return true;
	}

}
