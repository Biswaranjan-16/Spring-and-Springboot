package in.biswa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.biswa.service.EmployeeService;

@SpringBootApplication
public class DataJpaTxAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DataJpaTxAppApplication.class, args);
		
		EmployeeService bean= context.getBean(EmployeeService.class);
		
		bean.savedata();
	}

}
