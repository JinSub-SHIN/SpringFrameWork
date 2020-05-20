package kosta.orm.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kosta.orm.domain.CommentB;
import kosta.orm.domain.Reply;
import kosta.orm.domain.Users;

public class JoinDAO {

	// 1:1 인 경우
	
	public void association() {
		
//		try(SqlSession session = DbUtil.getSession()){
//			
//		}
//		
	
		SqlSession session = null;
		
		try {
			session = DbUtil.getSession();
			List<CommentB> list = session.selectList("joinMapper.associationJoin");  
			for(CommentB cb : list) {
				System.out.println(cb);
			}			
		} finally {
			DbUtil.sessionClose(session);
			
		}
		
		
	}
	
	
	public void collection() {
		
		SqlSession session = null;
		
		try {
			session = DbUtil.getSession();
			List<CommentB> list = session.selectList("joinMapper.collectionJoin");
			for(CommentB cb : list) {
				System.out.println(cb.getCommentContent());
				System.out.println(cb.getUserId());
				System.out.println(cb.getCommentContent());
				for(Reply re : cb.getReplyList()) {
					System.out.println(re);
				}
				
			}						
		} finally {
			DbUtil.sessionClose(session);
		}
		
		
	}
	
	
	/*
	 *  User를 기준으로 Comment 정보 가져오기 ( 1 : 다 )
	 */
	public void userCollection() {	
		SqlSession session = null;
		
		try {
			session = DbUtil.getSession();
			List<Users> list = session.selectList("joinMapper.userCollection");
			for(Users user : list) {
				System.out.println(user.getUserId());
				System.out.println(user.getUserName());
				for(CommentB cb :user.getCommentBList()) {
					System.out.println(cb);
				}
				System.out.println("==============================================");
			}									
		} finally {
			DbUtil.sessionClose(session);
		}
	}
}
