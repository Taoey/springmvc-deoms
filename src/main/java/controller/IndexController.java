package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	/**
	 * 用于转到登录页面
	 * 处理的url：/index/login
	 * @return
	 */
	@RequestMapping("/login")
	public String login() {
		//do something
		return "login";
	}

}
