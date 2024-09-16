package in.biswa.service;

import org.springframework.stereotype.Service;

import in.biswa.entity.Developer;
import in.biswa.repo.DevelopereRepository;

@Service
public class DeveloperService {
	private DevelopereRepository devRepo;

	public DeveloperService(DevelopereRepository devRepo) {
		this.devRepo = devRepo;
	}
	
	
	public void saveEmp() {
		
		Developer d=new Developer();
		d.setDevId(101);
		d.setDevName("Biswa");
		d.setDevSalary(54000);
		d.setDevDept("java");
		
		devRepo.save(d);
	}
}
