package kosta.mvc.domain;

import java.util.List;

public class MemberListDTO {

	private List<Member> list;

	public List<Member> getList() {
		System.out.println("겟리스트 호출됨...");
		return list;		
	}

	public void setList(List<Member> list) {
		
		System.out.println("리스트의 셋터 호출됨.. list  = " + list );
		this.list = list;
	}
	
	
	
}
