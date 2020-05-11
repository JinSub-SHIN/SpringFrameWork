package sample07;

public class MemberController {
	
	private Member m1;
	private Member m2;
	
	public MemberController() {
		System.out.println("기본생성자호출됨...");
	}
	
	public MemberController(Member m1) {
		this.m1 = m1;
		System.out.println("MemberController(Member m1) 호출 : member = " + m1);
		
	}
	
	public MemberController(Member member, Member m2) {
		this.m1 = member;
		this.m2 = m2;
		System.out.println("MemberController(Member m1&m2) 호출 : member = " + m1 + " / " + m2);
		
	}	
	
	public void setM1(Member m1) {
		this.m1 = m1;
		System.out.println("setMember1호출됨....." + m1 + "###너는왜호출되니??");		
	}
	
	public void setM2(Member m2) {
		this.m2 = m2;
		System.out.println("setMember2 호출됨...." + m2);
	}
	
}
