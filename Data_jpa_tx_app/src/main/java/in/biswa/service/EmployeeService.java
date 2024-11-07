package in.biswa.service;

import org.springframework.stereotype.Service;

import in.biswa.entity.Address;
import in.biswa.entity.Emp;
import in.biswa.repo.AddrRepo;
import in.biswa.repo.EmpRepo;


@Service
public class EmployeeService {

	private EmpRepo emprepo;

	private AddrRepo addrrepo;

	public EmployeeService(EmpRepo emprepo, AddrRepo addrrepo) {
		super();
		this.emprepo = emprepo;
		this.addrrepo = addrrepo;
	}
	
	public void savedata() {
		Emp emp = new Emp();

		emp.setEname("Biswa");
		emp.setEsal(138900.00);

		Emp savedEntity = emprepo.save(emp);
		
	

		Address addr = new Address();

		addr.setCity("bbsr");
		addr.setCountry("India");
		addr.setState("odisha");
		addr.setType("present");
		addr.setEmpid(savedEntity.getEid());

		addrrepo.save(addr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
