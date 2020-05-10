package sample03;

public class BookVo {

	private String subject;
	private String writer;
	private int price;
	private String date;
	
	public BookVo() {
		System.out.println("BV의 기본생성자 호출됨...");
	}

	public BookVo(String subject, String writer, int price, String date) {
		System.out.println("BV의 4개받는 생성자 호출됨...");
		this.subject = subject;
		this.writer = writer;
		this.price = price;
		this.date = date;
	}

	public String getSubject() {
		return subject;
	}

	public String getWriter() {
		return writer;
	}

	public int getPrice() {
		return price;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "BookVo [subject=" + subject + ", writer=" + writer + ", price=" + price + ", date=" + date + "]";
	}	
	
	
	
}
