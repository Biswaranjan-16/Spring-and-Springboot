package in.biswa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Springboot1Application.class, args);
		int count = context.getBeanDefinitionCount();
		System.out.println(count);
	}

}
