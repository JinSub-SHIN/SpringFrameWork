package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test.do")	
	public String haha(String no) {
		
		System.out.println("테스트컨트롤러 haha() 호출됨....");
		
		int convertNo = Integer.parseInt(no);
		System.out.println("convertNo = " + convertNo);
		
		
		return "result";
	}
	
}
