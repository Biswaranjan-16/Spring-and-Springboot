package in.biswa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.biswa.entity.Employee;
import in.biswa.repo.EmployeeRepo;
import in.biswa.service.EmployeeService;

@SpringBootApplication
public class SpringDataCrudJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataCrudJpaApplication.class, args);

		EmployeeService bean = context.getBean(EmployeeService.class);

//		 bean.saveEmployee();
//		 bean.saveMultipleEmployees();
//		 bean.getEmp();
//		 bean.getEmps();
//		 bean.getAllEmp();
//		 bean.ExitEmp();
//		 bean.totalEmp();
//		 bean.getEmpDept("nurse");
//		 bean.getEmpGender("female");
//		 bean.getEmpGenderAndEmpDept("male", "teacher");
		 //bean.getEmpSalaryGreaterThanEqual(40000.00);
		//bean.getAllEmpRecord();
		//bean.getEmpById(102);
		//bean.getEmpWithSort();
		bean.getEmpWithSortDesc();
		
		//EmployeeRepo emprepo=context.getBean(EmployeeRepo.class);
		
		//emprepo.deleteEmp(102);
		
		//List<Employee> empRecord = emprepo.getEmpRecord("tiku", "teacher");
		//empRecord.forEach(System.out::println);
		//emprepo.insertEmpRecord(100, "pinkun", "developer", "male", 45000.00);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
