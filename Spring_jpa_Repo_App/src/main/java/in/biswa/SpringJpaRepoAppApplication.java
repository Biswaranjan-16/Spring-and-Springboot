package in.biswa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.biswa.service.DeveloperService;

@SpringBootApplication
public class SpringJpaRepoAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJpaRepoAppApplication.class, args);
	
	DeveloperService bean = context.getBean(DeveloperService.class);
	bean.saveEmp();
	
	
	}

}
