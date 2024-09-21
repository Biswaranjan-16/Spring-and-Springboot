package in.biswa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.biswa.entity.ContactUsEntity;
import in.biswa.repo.ContactUsRepo;

@SpringBootApplication
public class SpringJpaTimeStampApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(SpringJpaTimeStampApplication.class, args);
		
          ContactUsRepo bean = context.getBean(ContactUsRepo.class);
		
          
          ContactUsEntity entity=new ContactUsEntity();
          entity.setCid(2);
          entity.setCname("himanshu");
          entity.setCemail("himanshu@gmail.com");
          entity.setCphno("9087398265");
          
          
          bean.save(entity);
		
	}

}
