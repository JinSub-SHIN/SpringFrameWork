package sample05;

public class ProductBean {

	private int p_no;
	private int p_price;
	private String p_name;
	
	public ProductBean() {
		System.out.println("ProductBean 생성자 호출됨....");
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	@Override
	public String toString() {
		return "ProductBean [p_no=" + p_no + ", p_price=" + p_price + ", p_name=" + p_name + "]";
	}
	
	
	
}
