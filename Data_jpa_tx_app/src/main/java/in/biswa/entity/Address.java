package in.biswa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emp_Add")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String city;
	private String state;
	private String country;
	private String Type;

	private int empid;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", state=" + state + ", country=" + country + ", Type=" + Type
				+ ", empid=" + empid + "]";
	}

}
