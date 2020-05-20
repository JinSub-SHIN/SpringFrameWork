package kosta.orm.repository;

import java.util.Arrays;

import kosta.orm.domain.Employees;

public class MainApp {

	public static void main(String[] args) {
		
		EmpDAO dao = new EmpDAO();

		// 전체검색
//		dao.ifTest(null);
		
		// last_name에 해당하는 레코드 검색
//		dao.ifTest(new Employees(0, "Walsh", null, null, null, 0, null));
		
		// job_id에 해당하는 레코드 검색
//		dao.ifTest(new Employees(0, null, null, null, "SH_CLERK", 0, null));
		
		// last_name and job_id에 해당하는 레코드 검색
//		dao.ifTest(new Employees(0, "Feeney", null, null, "SH_CLERK", 0, null));
		
//		dao.setTest(new Employees(197, "HOO", null, null, "AD_ASST", 7000, null));
		
		
		dao.forEachTest(Arrays.asList(100, 102, 103));
		
		
	}
}
