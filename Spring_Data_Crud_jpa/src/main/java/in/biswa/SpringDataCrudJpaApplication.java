package in.biswa;

import java.security.Provider.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.biswa.service.EmployeeService;

@SpringBootApplication
public class SpringDataCrudJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataCrudJpaApplication.class, args);
		
		EmployeeService bean = context.getBean(EmployeeService.class);
		
		//bean.saveEmployee();
		//bean.saveMultipleEmployees();
		//bean.getEmp();
		//bean.getEmps();
		//bean.getAllEmp();
		//bean.ExitEmp();
	    //bean.totalEmp();
	}

}
