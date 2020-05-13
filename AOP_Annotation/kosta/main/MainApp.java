package kosta.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kosta.service.MemberService;

public class MainApp {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("kosta/main/applicationContext.xml");
		
		MemberService service = context.getBean("service", MemberService.class);
		
		//service.register(2, "장희정");
		
		System.out.println("====================================================");
		
		boolean result = service.update("jang");
	//	System.out.println("리턴 결과 : " + result);
		
		
		
	}

}
