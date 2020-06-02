package kosta.mvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index"; //WEB-INF/views/index.jsp
	}
	
	@RequestMapping("/list")
	public ModelAndView list() {
		
		List<String> list = Arrays.asList(new String [] {"짬뽕", "짜장", "탕수육", "팔보채"});
		return new ModelAndView("result", "list" , list);
	}
	
}
