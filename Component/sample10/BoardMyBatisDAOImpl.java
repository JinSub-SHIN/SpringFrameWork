package sample10;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component // id = "boardMyBatisDAOImpl" 첫글자만 소문자.. (생성완료)
//@Component("boardMybatisDao")
@Repository("boardMybatisDao")
public class BoardMyBatisDAOImpl implements BoardDAO {

	public BoardMyBatisDAOImpl() {
		System.out.println("MyBatisDAOImpl 호출됨....");
	}
	
	@Override
	public void select() {
		
		System.out.println("BoardMyBatisDAOImpl의 select 호출됨....");
	}

}
