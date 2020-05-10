package sample03;

public class BookDAOImpl implements BookDAO {

	public BookDAOImpl() {}
	
	@Override
	public void insert(BookVo bv) {
		
		System.out.println("DAOImpl의 insert 호출됨...");
		System.out.println(bv);

	}

}
