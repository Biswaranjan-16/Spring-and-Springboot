package in.biswa;

public class Test {

	public static void main(String[] args) {
		PaymentService ps=new PaymentService(new CreditCard());
ps.dopayment(2300.00);
	}

}
