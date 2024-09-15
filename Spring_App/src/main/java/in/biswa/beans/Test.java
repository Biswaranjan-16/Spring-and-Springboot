package in.biswa.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		PaymentService service=  context.getBean(PaymentService.class);
		System.out.println(service.hashCode());
	}
}
