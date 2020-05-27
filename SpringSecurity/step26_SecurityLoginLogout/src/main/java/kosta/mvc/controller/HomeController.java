package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/admin/board")
	public void adminBoard() {
		
	}
	
	@RequestMapping("/admin/main")
	public void adminMain() {
		
	}
	
	@RequestMapping("/member/main")
	public void memberMain() {
		
	}
	
	@RequestMapping("/member/myPage")
	public void memberMypage() {
		
	}
	
	@RequestMapping("/user/board")
	public void userBoard() {
		
	}
	
	@RequestMapping("/user/login")
	public void userLogin() {
		
	}
	
	@RequestMapping("/user/loginForm")
	public void userLoginForm() {
		
	}
	
	@RequestMapping("/user/main")
	public void userMain() {
		
	}
}
