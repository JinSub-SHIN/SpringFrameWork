package sample11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookservice")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAOImpl;
	
	@Autowired
	private EmailSender esend;
	
	@Autowired
	private MessageSender msend;
	
	public BookServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void save(BookDTO dto1, BookDTO dto2) {
		
		bookDAOImpl.save(esend, msend, dto1, dto2);
		

	}

}
