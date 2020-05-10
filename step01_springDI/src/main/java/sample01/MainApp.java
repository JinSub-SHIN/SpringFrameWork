package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
//		MessageBean bean = new MessageBeanEnImpl();
//		
//		bean.sayHello("heejung");
//		
//		System.out.println("=====================");
//		
//		bean = new MessageBeanKoImpl();
//		bean.sayHello("희정");
		
		/**
		 *  SpringContainer를 이용하여 객체 lifecycle 관리
		 *  (xml문서 필요(@annotation변경) - Configration MetaData
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample01/applicationContext.xml");		
		
		System.out.println("------------------------");
		
//		boolean result = context.containsBean("ko");
//		System.out.println(result);
//		
//		MessageBean beanko = (MessageBean)context.getBean("ko");
//		
//		beanko.sayHello("진섭");
//		
//		MessageBean beanen = context.getBean("en", MessageBean.class);
//		
//		beanen.sayHello("Daniel");
		
		MessageBean bean1 = context.getBean("ko" , MessageBean.class);
		MessageBean bean2 = context.getBean("en" , MessageBean.class);
		MessageBean bean3 = context.getBean("en2" , MessageBean.class);
		MessageBean bean4 = context.getBean("en2" , MessageBean.class);
		
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
		System.out.println(bean4);
		
		

	}

}
