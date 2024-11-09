package in.biswa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="developer")
public class Dev {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int devId;
		private String devName;
		private Double  devsalary;
		
		
		public int getDevId() {
			return devId;
		}
		public void setDevId(int devId) {
			this.devId = devId;
		}
		public String getDevName() {
			return devName;
		}
		public void setDevName(String devName) {
			this.devName = devName;
		}
		public Double getDevsalary() {
			return devsalary;
		}
		public void setDevsalary(Double devsalary) {
			this.devsalary = devsalary;
		}
		
		
		
		
}
