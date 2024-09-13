package in.biswa.baens;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class Car implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("car starting.....");

	}

	public void drive() {
		System.out.println("i am driving car..... ");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("car stoped.....");

	}
}
