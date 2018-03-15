package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping("/login")
	public String login() {
		boolean validUser = true; //由M层获取，暂时设定为true
		String resultPage = "";
		
		if(validUser) {
			resultPage = "user";
		}else {
			resultPage = "userError";
		}
		
		return resultPage;
	}
}
