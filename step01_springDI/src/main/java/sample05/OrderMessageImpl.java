package sample05;

public class OrderMessageImpl implements OrderMessage {

	private int orderId;
	private String message;
	private UserBean ub;
	private ProductBean pb;
	
	public OrderMessageImpl() {
		System.out.println("IMPL생성자 호출됨...");
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public UserBean getUb() {
		return ub;
	}

	public void setUb(UserBean ub) {
		this.ub = ub;
	}

	public ProductBean getPb() {
		return pb;
	}

	public void setPb(ProductBean pb) {
		this.pb = pb;
	}

	@Override
	public void getOrder_Message() {	
		System.out.println("주문번호 : " + orderId);		
		System.out.println("회원ID : " + ub.getId());
		System.out.println("회원Name : " + ub.getName());
		System.out.println("회원ADDR : " + ub.getAddr());
		System.out.println("회원연락처 : " + ub.getPhone());
		System.out.println("상품번호 : " + pb.getP_no());
		System.out.println("상품가격 : " + pb.getP_price());
		System.out.println("상품이름 : " + pb.getP_name());		
		System.out.println(message);
		
	}
	
	
}
