package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	
//		Member member = new Member("jang", "111", 20, "판교");
//		MemberDAO memberDao = new MemberDAO();
//		
//		MemberService service = new MemberService(memberDao, member);
//		service.insert();

		ApplicationContext context = new ClassPathXmlApplicationContext("sample02/springDIConstructor.xml");	
		
		MemberService service = context.getBean("service" , MemberService.class);
		service.insert();
		
	}

}
