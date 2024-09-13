package in.biswa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.biswa.baens.Car;

@SpringBootApplication
public class SpringBeanLifecycleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBeanLifecycleApplication.class, args);
	
	Car bean = context.getBean(Car.class);
	
	bean.drive();
	
	context.close();
	}

}
