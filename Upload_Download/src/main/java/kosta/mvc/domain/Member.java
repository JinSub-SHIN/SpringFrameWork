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
		System.out.println("�¾��̵� ��... " + id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("�³��� ��... " + name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("�¿����� ��... " + age);
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
		System.out.println("�¿��̵��� ��... " + addr);
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
