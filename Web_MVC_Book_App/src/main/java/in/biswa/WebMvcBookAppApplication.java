package in.biswa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.biswa.service.BookService;

@SpringBootApplication
public class WebMvcBookAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(WebMvcBookAppApplication.class, args);
		
	}

}
