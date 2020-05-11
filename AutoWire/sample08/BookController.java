package sample08;

public class BookController {

	private BookService service;
	private BookDTO dto1;
	private BookDTO dto2;
	
	
	public BookController() {
		// TODO Auto-generated constructor stub
	}
		
	public BookController(BookService service, BookDTO dto1, BookDTO dto2) {
		super();
		this.service = service;
		this.dto1 = dto1;
		this.dto2 = dto2;
		System.out.println("컨트롤러 3개받는 생성자호출됨...");
	}

	public void invoken() {
		
		service.save(dto1, dto2);
		
	}
	
}
