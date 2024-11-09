package in.biswa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.biswa.entity.Address;

public interface AddRepo extends JpaRepository<Address, Integer>{

}
