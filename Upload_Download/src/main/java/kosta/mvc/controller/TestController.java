package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test.do")	
	public String haha(String no) {
		
		System.out.println("�׽�Ʈ��Ʈ�ѷ� haha() ȣ���....");
		
		int convertNo = Integer.parseInt(no);
		System.out.println("convertNo = " + convertNo);
		
		
		return "result";
	}
	
}
