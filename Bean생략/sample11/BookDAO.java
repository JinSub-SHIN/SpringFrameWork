package sample11;

public interface BookDAO {

	void save(EmailSender emailsender, MessageSender messageSender, BookDTO dto1, BookDTO dto2);
	
}
