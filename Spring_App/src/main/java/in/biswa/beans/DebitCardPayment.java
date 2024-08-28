package in.biswa.beans;

public class DebitCardPayment implements IPayment{
public DebitCardPayment(){
	System.out.println("debitcard :: constructor");
}
	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Debit Card Payment successfull..");
		return true;
	}

}
