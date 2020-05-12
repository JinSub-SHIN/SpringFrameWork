package sample11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements BookDAO {

	@Autowired
	private DbUtil db;
	
	public BookDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void save(EmailSender emailsender, MessageSender messageSender, BookDTO dto1, BookDTO dto2) {
		
		System.out.println(emailsender);
		System.out.println(messageSender);
		System.out.println(dto1);
		System.out.println(dto2);
		System.out.println(db);

	}

}
