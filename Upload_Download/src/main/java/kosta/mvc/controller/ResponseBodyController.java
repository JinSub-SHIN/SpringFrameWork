package kosta.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController  // @Controller + @ResponseBody...
public class ResponseBodyController {

	@RequestMapping(value = "/responseBody.do" , produces = "text/html;charset=UTF-8")
	//@ResponseBody // 리턴되는 값이 그대로 응답 객체가 된다...
	public String aa() {
		System.out.println("리스폰스 바디 컨트롤러 aa() 호출됨...");
		
		return "점심먹지?";
	}
	
	
	@RequestMapping(value = "/responseBody2.do" , produces = "text/html;charset=UTF-8")
	//@ResponseBody // 리턴되는 값이 그대로 응답 객체가 된다...
	public String bb() {
		System.out.println("리스폰스 바디 컨트롤러 bb() 호출됨...");
		
		return "재미있어요~";
	}
	
}
