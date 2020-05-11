package sample09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmpController {

	@Autowired // byType 먼저 --> 여러개라면 byName 을 주입...
	@Qualifier("aa")
	private EmpDTO dto1;
	@Autowired
	@Qualifier("bb")
	private EmpDTO dto2;	
	@Autowired
	private EmpService service;
	
	public void test() {
		System.out.println("dto : " + dto1 + "/" +dto1.getEmpno());
		System.out.println("dto2 : " + dto2 + "/" + dto2.getEmpno());
		System.out.println("service : " + service);
	}
	
}
