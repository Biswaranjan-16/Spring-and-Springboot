package in.biswa.DAO;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements IUserDao {

	@Override
	public boolean saveUser(String name, String email, String pwd) {
		System.out.println("record inserted into db");
		return true;
	}

}
