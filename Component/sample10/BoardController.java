package sample10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component("controller") // 생성과 id ="controller"
@Controller("controller")
public class BoardController {

	@Autowired // byType
	private BoardService boardServiceImpl;
	
	@Autowired
	private BoardDTO boardDTO;
	
	@Autowired
	private BoardDTO boardDTO2;
	
	public BoardController() {
		// TODO Auto-generated constructor stub
	}
	
	public void test() {
		
		System.out.println("BoardController의 test 호출됨...");
		System.out.println("boardDTO : " + boardDTO);
		System.out.println("boardDTO2 : " + boardDTO2);
		
		boardServiceImpl.select();
				
	}
	
}
