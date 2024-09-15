package in.biswa.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.biswa.DAO.IUserDao;

@Component
public class UserService {
	@Autowired
	private PwdService pwdService;
	
	@Autowired
	private IUserDao userDao;
	
	@Autowired
	private EmailService emailService;

	public void registerUser(String name, String email, String pwd) {

		// encrypt pwd
		String encryptpwd = pwdService.encryptPwd(pwd);
		// save user in db
		boolean isSaved = userDao.saveUser(name, email, encryptpwd);
		// send email
		if (isSaved) {
			boolean isSent = emailService.sendEmail(email, "test subject", "test body");

			if (isSent) {
				System.out.println("registration successfull......");
			}
		}

	}

}
