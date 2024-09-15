package in.biswa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.biswa.entity.Teacher;
import in.biswa.repo.TeacherRepository;

@SpringBootApplication
public class SpringJpaAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJpaAppApplication.class, args);
		
		TeacherRepository techrepo=context.getBean(TeacherRepository.class);
		
		Teacher t=new Teacher();
		t.setTeacherAge(54);
		t.setTeacherName("rabi");
		
		techrepo.save(t);
	}

}
