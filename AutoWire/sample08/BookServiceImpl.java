package sample08;

public class BookServiceImpl implements BookService {

	private BookDAO dao;
	private MessageSender msender;
	private EmailSender esender;
	
	public BookServiceImpl() {
		// TODO Auto-generated constructor stub
	}	
	
	public BookServiceImpl(BookDAO dao) {
		super();
		this.dao = dao;
		System.out.println("서비스호출됨...");
	}

	@Override
	public void save(BookDTO dto, BookDTO dto2) {
		
		dao.save(esender, msender, dto, dto2);
		
	}

	public void setMsender(MessageSender msender) {
		this.msender = msender;
	}

	public void setEsender(EmailSender esender) {
		this.esender = esender;
	}


	
	

}
