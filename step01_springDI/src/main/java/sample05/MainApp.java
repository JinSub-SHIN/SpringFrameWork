package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample05/springDISetterExam.xml");
		
		OrderMessageImpl im = context.getBean("orderMessage" , OrderMessageImpl.class);
		im.getOrder_Message();

	}

}
