package kosta.mvc.domain;

public class Member {

	private String id;
	private String name;
	private int age;
	private String addr;
	
	private boolean state;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		System.out.println("셋아이디 콜... " + id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("셋네임 콜... " + name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("셋에이지 콜... " + age);
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
		System.out.println("셋에이디디알 콜... " + addr);
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	
}
