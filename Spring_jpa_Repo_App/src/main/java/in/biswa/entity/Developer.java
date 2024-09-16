package in.biswa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Developer {

	@Id
	private int devId;
	private int devSalary;
	private String devName;
	private String devDept;
	
	
	public Developer() {
	}
	
	public Developer(int devId, int devSalary, String devName, String devDept) {
		super();
		this.devId = devId;
		this.devSalary = devSalary;
		this.devName = devName;
		this.devDept = devDept;
	}

	public int getDevId() {
		return devId;
	}

	public void setDevId(int devId) {
		this.devId = devId;
	}

	public int getDevSalary() {
		return devSalary;
	}

	public void setDevSalary(int devSalary) {
		this.devSalary = devSalary;
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getDevDept() {
		return devDept;
	}

	public void setDevDept(String devDept) {
		this.devDept = devDept;
	}

	@Override
	public String toString() {
		return "Developer [devId=" + devId + ", devSalary=" + devSalary + ", devName=" + devName + ", devDept="
				+ devDept + "]";
	}
	
	
	
	
}
