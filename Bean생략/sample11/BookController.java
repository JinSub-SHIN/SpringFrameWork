package sample11;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("controller")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private BookDTO book1;
	
	@Autowired
	private BookDTO book2;
	
	public BookController() {
		// TODO Auto-generated constructor stub
	}
	
	public void invoker() {
		
		bookService.save(book1, book2);
		
	}

}
