package in.biswa.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import in.biswa.entity.Address;

public interface AddrRepo extends JpaRepository<Address, Integer> {

}
