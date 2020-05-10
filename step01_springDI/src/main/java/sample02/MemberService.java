package sample02;

public class MemberService {

	private MemberDAO memberDao;
	private Member member;
	
	public MemberService() {
		System.out.println("MemberService의 기본생성자...");
	}
		
	public MemberService(MemberDAO memberDao, Member member) {
		System.out.println("MemberService의 2개 다 받는 생성자..");
		this.memberDao = memberDao;
		this.member = member;
	}
	
	public void insert() {
		System.out.println("MemberService의 insert 호출됨...");
		memberDao.insert(member);
	}
	
}
