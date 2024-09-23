package in.biswa;

import java.security.Provider.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.biswa.service.BookService;

@SpringBootApplication
public class CompositePkAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(CompositePkAppApplication.class, args);
	
	
	BookService bean = context.getBean(BookService.class);
	
    //bean.saveBook();
    bean.getBook();
	}

}
