package in.biswa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/")
	public String getMsg() {
		return "welcome to my home";

	}
}
