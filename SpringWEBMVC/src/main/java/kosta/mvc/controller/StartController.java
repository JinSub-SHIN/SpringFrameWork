package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 생성이면서 controller의 역할이 된다..
public class StartController {

	
	/*
	 *  리턴이 String이면 리턴값이 뷰의 이름이 된다..
	 */
	
	@RequestMapping("/a.do")
	public String aaa() {
		
		System.out.println("String aaa()메소드 호출됨... 'a/do' ");
		
		return "result"; // WEB-INF/views/result.jsp
	}
}
