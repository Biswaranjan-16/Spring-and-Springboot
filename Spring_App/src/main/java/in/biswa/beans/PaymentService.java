package in.biswa.beans;

public class PaymentService {
	private IPayment payment;
	public PaymentService() {
		System.out.println("paymentservice :; constructor");
	}


public PaymentService(IPayment payment) {
	this.payment=payment;
}

public void doPayment(double billAmt) {
	boolean status=payment.processPayment(billAmt);
	
	if(status) {
		System.out.println("Receipt Printing");
	}else {
		System.out.println("Card Invalid");
	}
}
}
