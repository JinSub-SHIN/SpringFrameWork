package kosta.mvc.domain;

import java.util.List;

public class MemberListDTO {

	private List<Member> list;

	public List<Member> getList() {
		System.out.println("�ٸ���Ʈ ȣ���...");
		return list;		
	}

	public void setList(List<Member> list) {
		
		System.out.println("����Ʈ�� ���� ȣ���.. list  = " + list );
		this.list = list;
	}
	
	
	
}
