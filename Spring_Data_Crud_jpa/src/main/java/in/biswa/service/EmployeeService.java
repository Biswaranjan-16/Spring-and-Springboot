package in.biswa.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import in.biswa.entity.Employee;
import in.biswa.repo.EmployeeRepo;

@Service
public class EmployeeService {
	private EmployeeRepo empRepo;
	
	public void getEmpByQBE() {
		Employee employee=new Employee();
	    employee.setEmpDept("IAF");
	    Example<Employee> of = Example.of(employee);
	    List<Employee> findall = empRepo.findAll(of);
	    findall.forEach(e -> System.out.println(e));
	}
	
	public void empPagination(int pageNo,int pageSize) {
		PageRequest of = PageRequest.of(pageNo-1, pageSize);
	Page<Employee> all = empRepo.findAll(of);
		List<Employee> content = all.getContent();
		content.forEach(System.out::println);
	}
	
	public void saveEmp() {
		Employee emp=new Employee();
		emp.setEmpGender("male");
		emp.setEmpName("ajay");
		emp.setEmpDept("IAF");
		emp.setEmpid(101);
		emp.setEmpSalary(54000);
		
		empRepo.save(emp);
	}
	
	public void getEmpWithColumn(String column) {
		Sort descending = Sort.by(column).descending();
		List<Employee> all = empRepo.findAll(descending);
		all.forEach(System.out::println);
	}

	public void getEmpWithSortDesc() {
		Sort descending = Sort.by("empSalary").descending();
		List<Employee> desc = empRepo.findAll(descending);
		desc.forEach(System.out::println);
	}

	public void getEmpWithSort() {
		Sort sort = Sort.by("empSalary").ascending();
		List<Employee> all = empRepo.findAll(sort);
		all.forEach(System.out::println);
	}

	public EmployeeService(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}

	public void getEmpById(Integer Id) {
		Employee empById = empRepo.getEmpById(Id);
		System.out.println(empById);
	}

	public void getAllEmpRecord() {
		List<Employee> allEmpRecord = empRepo.getAllEmpRecord();
		allEmpRecord.forEach(System.out::println);
	}

	public void getEmpGenderAndEmpDept(String gender, String dept) {
		List<Employee> byEmpGenderAndEmpDept = empRepo.findByEmpGenderAndEmpDept(gender, dept);
		byEmpGenderAndEmpDept.forEach(System.out::println);
	}

	public void getEmpSalaryGreaterThanEqual(Double salary) {
		List<Employee> byEmpSalaryGreaterThanEqual = empRepo.findByEmpSalaryGreaterThanEqual(salary);
		byEmpSalaryGreaterThanEqual.forEach(System.out::println);
	}

	public void getEmpGender(String gender) {
		List<Employee> byEmpGender = empRepo.findByEmpGender(gender);
		byEmpGender.forEach(System.out::println);
	}

	public void getEmpDept(String dept) {
		List<Employee> byEmpDept = empRepo.findByEmpDept(dept);
		byEmpDept.forEach(System.out::println);
	}

	public void getEmp() {
		Optional<Employee> byId = empRepo.findById(104);
		if (byId.isPresent()) {
			Employee employee = byId.get();
			System.out.println(employee);
		}
	}

	public void totalEmp() {
		long count = empRepo.count();
		System.out.println(count);
	}

	public void ExitEmp() {
		boolean existsById = empRepo.existsById(102);
		System.out.println(existsById);
	}

	public void getEmps() {
		List<Integer> asList = Arrays.asList(102, 104, 108);
		Iterable<Employee> allById = empRepo.findAllById(asList);
		allById.forEach(System.out::println);
	}

	public void getAllEmp() {
		Iterable<Employee> all = empRepo.findAll();
		all.forEach(System.out::println);
	}

	public void saveEmployee() {

		Employee emp = new Employee();
		emp.setEmpid(108);
		emp.setEmpName("Biswa");
		emp.setEmpDept("developer");
		emp.setEmpGender("male");
		emp.setEmpSalary(30900);

		empRepo.save(emp);
	}

	public void saveMultipleEmployees() {

		Employee emp1 = new Employee();
		emp1.setEmpid(104);
		emp1.setEmpName("tiku");
		emp1.setEmpDept("teacher");
		emp1.setEmpGender("male");
		emp1.setEmpSalary(40000);

		Employee emp2 = new Employee();
		emp2.setEmpid(102);
		emp2.setEmpName("juli");
		emp2.setEmpDept("nurse");
		emp2.setEmpGender("female");
		emp2.setEmpSalary(35000);

		List<Employee> asList = Arrays.asList(emp1, emp2);
		empRepo.saveAll(asList);
	}
}
