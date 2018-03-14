package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	/**
	 * 用于转到登录页面
	 * 页面的转发
	 * 处理的url：/index/login
	 * @return
	 */
	@RequestMapping("/login")
	public String login() {
		//do something
		return "login";
	}
	/**
	 * 重定向到html1
	 * 重定向的应用
	 * 处理的url：/index/html1
	 * @return
	 */
	@RequestMapping("/html1")
	public String html1() {
		return "forward:/html/html1.html";
	}

}
