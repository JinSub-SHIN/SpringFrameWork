package sample02;

public class Member {

	private String id;
	private String pwd;
	private int age;
	private String addr;
	
	public Member() {
		System.out.println("Member기본생성자...");
	}

	public Member(String id) {		
		this.id = id;
		System.out.println("Member(Stirng id) 생성자 call...");
	}

	public Member(String id, String pwd) {
		System.out.println("Member(String id, String pwd) 생성자 call...");
		this.id = id;
		this.pwd = pwd;
	}

	public Member(String id, int age) {
		System.out.println("Member(String id, int age) 생성자 call...");
		this.id = id;		
		this.age = age;
	}
	
	public Member(String id, String pwd, int age) {
		System.out.println("Member(String id, String pwd, int age) 생성자 call...");
		this.id = id;
		this.pwd = pwd;
		this.age = age;
	}

	public Member(String id, String pwd, int age, String addr) {
		System.out.println("Member(String id, String pwd, int age, String addr) 생성자 call...");
		this.id = id;
		this.pwd = pwd;
		this.age = age;
		this.addr = addr;
	}
	
	
	
	
	
	
	
}
