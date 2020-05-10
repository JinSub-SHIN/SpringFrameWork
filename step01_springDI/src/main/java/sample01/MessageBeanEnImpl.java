package sample01;

public class MessageBeanEnImpl implements MessageBean {

	public MessageBeanEnImpl() {
		
		System.out.println("En 생성자...");
		
	}
	
	
	@Override
	public void sayHello(String name) {
		
		System.out.println(name+" Nim Hello~");

	}

}
