package in.biswa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.biswa.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
