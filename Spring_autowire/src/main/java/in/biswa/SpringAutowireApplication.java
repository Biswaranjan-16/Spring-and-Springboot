package in.biswa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.biswa.Service.UserService;

@SpringBootApplication
public class SpringAutowireApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringAutowireApplication.class, args);
		UserService user = context.getBean(UserService.class);
		
		user.registerUser("biswa", "biswa@gmail.com", "biswa@123");
	
	}

}
