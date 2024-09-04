package in.biswa.Service;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
public boolean sendEmail(String to,String subject,String body) {
	
	//logic 
	System.out.println("email sent to user.... ");
	return true;
	
} 
}
