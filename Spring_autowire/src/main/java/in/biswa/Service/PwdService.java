package in.biswa.Service;

import org.springframework.stereotype.Component;

@Component
public class PwdService {
	public String encryptPwd(String pwd) {

		// logic

		System.out.println("password encrypted... ");
		return pwd;

	}
}
