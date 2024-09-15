package in.biswa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {

	@Id
	private int teacherAge;
	private String teacherName;
	public int getTeacherAge() {
		return teacherAge;
	}
	public void setTeacherAge(int teacherAge) {
		this.teacherAge = teacherAge;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	
}
