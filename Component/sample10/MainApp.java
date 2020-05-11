package sample10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample10/applicationContext.xml");
		
		BoardController con = context.getBean("controller", BoardController.class);
		con.test();
	}

}
