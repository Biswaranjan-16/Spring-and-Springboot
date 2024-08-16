
public class App {
public static void main(String[] args) {
	 IPayment p1=new DebitCardPayment();
	 
	 IPayment p2=new DebitCardPayment();
	 
	 //constructor injrction
	PaymentService ps=new PaymentService(p1);
	
	 //setter injection
	 ps.setPayment(p2);
	 
	 ps.doPayment(200.00);
 
}
}
