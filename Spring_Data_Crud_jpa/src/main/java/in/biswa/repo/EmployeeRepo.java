package in.biswa.repo;

import org.springframework.data.repository.CrudRepository;

import in.biswa.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
