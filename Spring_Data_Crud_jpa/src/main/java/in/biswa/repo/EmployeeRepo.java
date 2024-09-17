package in.biswa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import in.biswa.entity.Employee;
import jakarta.transaction.Transactional;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByEmpDept(String dept);

	public List<Employee> findByEmpGender(String gender);

	public List<Employee> findByEmpGenderAndEmpDept(String gender, String dept);
	
	public List<Employee> findByEmpSalaryGreaterThanEqual(Double salary);
	
	@Query("from Employee")
	public List<Employee> getAllEmpRecord();
	
	@Query("from Employee where empid= :id")
	public Employee getEmpById(Integer id);
	
	@Transactional
	@Modifying
	@Query("delete from Employee where empid=:eid")
	public void deleteEmp(Integer eid);
	
	@Query("from Employee where empName=:ename and empDept=:edept")
	public List<Employee> getEmpRecord(String ename,String edept);
	
	@Modifying
	@Transactional
	@Query(value="insert into employee (empid,emp_name,emp_dept,emp_gender,emp_salary) values (:eid,:ename,:edept,:egender,:esalary)",nativeQuery=true)
	public void insertEmpRecord(Integer eid,String ename,String edept,String  egender,Double esalary );
	
	
}
