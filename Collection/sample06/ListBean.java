package sample06;

import java.util.List;

public class ListBean {

	private List<Integer> intList;
	private List<String> strList;
	private List<Customer> customerList;
	
	public List<Integer> getIntList() {
		return intList;
	}
	public void setIntList(List<Integer> intList) {
		this.intList = intList;
		System.out.println("setIntList 호출됨..." + intList);
	}
	public List<String> getStrList() {
		return strList;
	}
	public void setStrList(List<String> strList) {
		this.strList = strList;
		System.out.println("setStrList 호출됨..." + strList);
	}
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
		System.out.println("setCustomerList 호출됨..." + customerList);
	}
	
	
	
}
