package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // �����̸鼭 controller�� ������ �ȴ�..
public class StartController {

	
	/*
	 *  ������ String�̸� ���ϰ��� ���� �̸��� �ȴ�..
	 */
	
	@RequestMapping("/a.do")
	public String aaa() {
		
		System.out.println("String aaa()�޼ҵ� ȣ���... 'a/do' ");
		
		return "result"; // WEB-INF/views/result.jsp
	}
}
