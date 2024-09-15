package in.biswa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private int empid;
	private String empName;
	private String empDept;
	private String empGender;
	private int empSalary;
	
	public Employee() {
	}

	public Employee(int empid, String empName, String empDept, String empGender, int empSalary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empDept = empDept;
		this.empGender = empGender;
		this.empSalary = empSalary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empDept=" + empDept + ", empGender=" + empGender
				+ ", empSalary=" + empSalary + "]";
	}
	
	
}
