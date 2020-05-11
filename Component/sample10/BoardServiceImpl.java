package sample10;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component // 생성 id="boardServiceImpl"
@Service
public class BoardServiceImpl implements BoardService {

	@Resource(name = "boardDAOImpl")
	private BoardDAO boardDao;
	@Autowired
	private BoardDAO boardMybatisDao;
	
	public BoardServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void select() {
		
		System.out.println("BoardServiceImpl의 select 호출됨...");
		boardDao.select();
		boardMybatisDao.select();
		
	}

}
