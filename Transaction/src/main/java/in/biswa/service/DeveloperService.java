package in.biswa.service;

import org.springframework.stereotype.Service;

import in.biswa.entity.Address;
import in.biswa.entity.Dev;
import in.biswa.repo.AddRepo;
import in.biswa.repo.DevRepo;


@Service
public class DeveloperService {

	
	private DevRepo devrepo;
	
	private AddRepo addrepo;

	public DeveloperService(DevRepo devrepo, AddRepo addrepo) {
		super();
		this.devrepo = devrepo;
		this.addrepo = addrepo;
	}
	
	public  void savedata() {
		
		Dev dev=new Dev();
		dev.setDevName("Biswaranjan Biswal");
		dev.setDevsalary(13000.00);
		
		Dev saveddev=devrepo.save(dev);
		
		Address address=new Address();
		
		address.setCity("Bhubaneswar");
		address.setCountry("India");
		address.setState("Odisha");
		address.setType("Present");
		address.setDevId(saveddev.getDevId());
		
		addrepo.save(address);
		
	}
}
