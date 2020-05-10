package sample03;

public class BookController {

	private BookDAO dao;
	private BookVo bv;
	
	public BookController() {}
	
	public BookController(BookDAO dao , BookVo bv) {
		System.out.println("컨트롤로 두개받는거 호출");
		this.dao = dao;
		this.bv = bv;
	}
	
	public void bookInsert() {
		
		dao.insert(bv);
	}
	
}
