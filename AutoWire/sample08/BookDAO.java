package sample08;

public interface BookDAO {

	void save(EmailSender esender, MessageSender msender, BookDTO dto, BookDTO dto2);
	
}
