package kosta.orm.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CommentB {

	private int commentNo;
	private String userId;
	private String commentContent;
	private String regDate;
	
	// 1:1 의 관계
	//private Users user;
	
	// 1: 다인 경우..
	
	private List<Reply> replyList;
	
}
