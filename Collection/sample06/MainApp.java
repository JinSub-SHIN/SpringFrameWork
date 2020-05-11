package sample06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample06/springDIList02.xml");
		
		ListBean lb = context.getBean("listBean", ListBean.class);
		
		for(int i=0 ; i<lb.getCustomerList().size() ; i++) {
			
			System.out.print(i+"번째 아이디" +lb.getCustomerList().get(i).getId() +" / ");
			System.out.print(i+"번째 나이" +lb.getCustomerList().get(i).getAge() + " / ");
			System.out.print(i+"번째 주소" +lb.getCustomerList().get(i).getAddr() +" / ");
			System.out.println();
			
		}
	}

}
