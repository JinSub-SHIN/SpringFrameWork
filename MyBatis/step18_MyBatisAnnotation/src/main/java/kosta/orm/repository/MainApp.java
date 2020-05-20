package kosta.orm.repository;

import kosta.orm.domain.Employees;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("1. 사원 first_name 가져오기 ");
		
		EmpDAO dao = new EmpDAO();
		
//		dao.selectByName();
		
//		dao.insert(new Employees(350, "girl", "ffasdfd@daum.net", null, null, 6000, null));
		
//		dao.delete(400);
		
//		dao.selectAll();
		
//		dao.selectByEmpId(800);
		
//		dao.selectByOrder("salary");
		
//		dao.selectWhereSalary(2500);
		
//		dao.selectByMaxMin(2000, 3000);
		
//		dao.selectByKeyField("last_name", "an");
		
		dao.ifTest(new Employees(0, null, null, null, "AD_VP", 0, null));
		

	}

}
