package in.biswa;

public class PaymentService {
private  IPayment payment ;

public PaymentService(IPayment payment) {
	this.payment=payment;
}
	public void dopayment(double billamt) {
		boolean status=payment.payment(billamt);
		
		if(status) {
			System.out.println("uuu");
		}else {
			System.out.println("jjj");
		}
	}
	
}
	

