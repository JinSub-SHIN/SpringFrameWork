package sample08;

public class BookDAOImpl implements BookDAO {

	private DbUtil db;
	
	public BookDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public BookDAOImpl(DbUtil db) {
		System.out.println("DAOIMPL 생성자 호출됨....");
		this.db = db;
		
	}
	
	@Override
	public void save(EmailSender esender, MessageSender msender, BookDTO dto, BookDTO dto2) {
		
		System.out.println("esender : " + esender);
		System.out.println("msender : " + msender);
		System.out.println("dto : "+ dto);
		System.out.println("dto2 : " + dto2);
		System.out.println("DbUtil : " + db);

	}

}
