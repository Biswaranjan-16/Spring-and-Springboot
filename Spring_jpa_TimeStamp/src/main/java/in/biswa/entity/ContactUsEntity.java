package in.biswa.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name ="Contact_us_leads")
public class ContactUsEntity {

	@Id
	private int cid;
	private String cname;
	private String cemail;
	private String cphno;
	
	@CreationTimestamp
	@Column(name="createdatetime",updatable = false)
	private LocalDateTime createdatetime;
	
	@UpdateTimestamp
	@Column(name="updatedatetime",insertable = false)
	private LocalDateTime updatedatetime;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCphno() {
		return cphno;
	}

	public void setCphno(String cphno) {
		this.cphno = cphno;
	}

	public LocalDateTime getCreatedatetime() {
		return createdatetime;
	}

	public void setCreatedatetime(LocalDateTime createdatetime) {
		this.createdatetime = createdatetime;
	}

	public LocalDateTime getUpdatedatetime() {
		return updatedatetime;
	}

	public void setUpdatedatetime(LocalDateTime updatedatetime) {
		this.updatedatetime = updatedatetime;
	}
	
	
	
}
