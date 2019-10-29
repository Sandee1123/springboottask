
package com.task.main.controller;
//for web

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/login")
	public String getLogin() {
		return "please login";
	}
	
}
////////////////////////for web  . ///////////////