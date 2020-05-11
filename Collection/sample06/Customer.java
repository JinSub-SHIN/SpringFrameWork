package sample06;

public class Customer {

	private String id;
	private int age;
	private String addr;
	
	public Customer() {
		System.out.println("Customer 기본 생성자 호출됨......");
	}
	
	public Customer(String id) {
		super();
		this.id = id;
		System.out.println("Customer(String id) 생성자 호출됨....");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		System.out.println("setId 호출됨....");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("setAge 호출됨....");
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
		System.out.println("setAddr 호출됨...." + addr);
	}	
	
}
