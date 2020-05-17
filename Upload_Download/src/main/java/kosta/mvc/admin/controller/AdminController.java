package kosta.mvc.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping("a.admin")
	public String admin() {
		
		System.out.println("AdminController ¿‘¥œ¥Ÿ...");
		
		return "result";
	}
	
}
