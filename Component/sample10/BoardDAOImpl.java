package sample10;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component // <bean class="BoardDAOImpl"> 대신 사용한다.. , id="boardDAOImpl" 클래스 이름을 그대로 따오되 첫글자만 소문자..
@Repository
public class BoardDAOImpl implements BoardDAO {

	public BoardDAOImpl() {
		System.out.println("BoardDAOImpl 생성자 호출됨....");
	}
	
	@Override
	public void select() {
		
		System.out.println("BoardDAOImpl의 select 호출됨....");
	}

}
