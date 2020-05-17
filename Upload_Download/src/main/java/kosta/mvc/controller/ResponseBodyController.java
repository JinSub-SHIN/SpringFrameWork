package kosta.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController  // @Controller + @ResponseBody...
public class ResponseBodyController {

	@RequestMapping(value = "/responseBody.do" , produces = "text/html;charset=UTF-8")
	//@ResponseBody // ���ϵǴ� ���� �״�� ���� ��ü�� �ȴ�...
	public String aa() {
		System.out.println("�������� �ٵ� ��Ʈ�ѷ� aa() ȣ���...");
		
		return "���ɸ���?";
	}
	
	
	@RequestMapping(value = "/responseBody2.do" , produces = "text/html;charset=UTF-8")
	//@ResponseBody // ���ϵǴ� ���� �״�� ���� ��ü�� �ȴ�...
	public String bb() {
		System.out.println("�������� �ٵ� ��Ʈ�ѷ� bb() ȣ���...");
		
		return "����־��~";
	}
	
}
