package kosta.orm.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kosta.orm.domain.Employees;

public class EmpDAO {

	/*
	 *  등록하기
	 */
	public void insert(Employees employees) {
		
		SqlSession session = null;
		boolean state = false;
				
		try {
			session = DbUtil.getSession();
			EmployeesMapper mapper = session.getMapper(EmployeesMapper.class);
			state = mapper.insert(employees) > 0 ? true : false;			
						
		} finally {
							
			DbUtil.sessionClose(session, state);
		}		
	}
	
	public void delete(int employeeId) {
		
		SqlSession session = null;
		boolean state = false;
				
		try {
			session = DbUtil.getSession();
			EmployeesMapper mapper = session.getMapper(EmployeesMapper.class);
			state = mapper.delete(employeeId) > 0 ? true : false;			
						
		} finally {
							
			DbUtil.sessionClose(session, state);
		}		
	}
	
	
	public void update(Employees employee) {
		
		SqlSession session = null;
		boolean state = false;
		
		try {
			session = DbUtil.getSession();
			EmployeesMapper mapper = session.getMapper(EmployeesMapper.class);
			state = mapper.update(employee) > 0 ? true : false;			
			
		} finally {
			DbUtil.sessionClose(session, state);
		}
				
	}
	
	
	/*
	 *  전체검색
	 */
	public List<Employees> selectAll(){
		
		SqlSession session = null;
		List<Employees> list = new ArrayList<Employees>();
		try {
			session = DbUtil.getSession();
			EmployeesMapper mapper = session.getMapper(EmployeesMapper.class);
			list = mapper.selectAll();	
			
			for(Employees e : list) {
				System.out.println(e);
			}
			
		} finally {
			DbUtil.sessionClose(session);
		}		
		return list;		
	}
	
	/*
	 *  employee_id에 해당하는 사원 검색
	 */
	public void selectByEmpId(int employeeId){
		
		SqlSession session = null;		
		try {
			session = DbUtil.getSession();
			EmployeesMapper mapper = session.getMapper(EmployeesMapper.class);
			Employees employee = mapper.selectById(employeeId);			
			System.out.println(employee);			
			
		} finally {
			DbUtil.sessionClose(session);
		}	
	}		
	
	public void ifTest(Employees emp) {
		
		SqlSession session = null;
		
		try {		
			session = DbUtil.getSession();
			EmployeesMapper mapper = session.getMapper(EmployeesMapper.class);
			List<Employees> list = mapper.ifSelect(emp);
			for(Employees e : list) {
				System.out.println(e);
			}			
			
		} finally {
			DbUtil.sessionClose(session);
		}
		
	}
	
	
//	/*
//	 *  salary가 5000 ~ 10000 사이 검색하기
//	 */
//	
//	
//	/*
//	 *  특정 컬럼을 기준으로 정렬하기
//	 */
//	public void selectByOrder(String columnName){
//		
//		SqlSession session = null;		
//		try {
//			session = DbUtil.getSession();
//			List<Employees> list = session.selectList("empSelect.selectByOrder", columnName);	
//			for(Employees emp : list) {
//				System.out.println(emp);
//			}
//			
//			
//		} finally {
//			DbUtil.sessionClose(session);
//		}	
//	}	
//	
//	
//	/*
//	 *  salary를 인수로 전달 받아 salary보다 적게 받는 사원의 정보 검색
//	 */
//	public void selectWhereSalary(int salary){
//		
//		SqlSession session = null;		
//		try {
//			session = DbUtil.getSession();
//			List<Employees> list = session.selectList("empSelect.selectWhereSalary", salary);	
//			for(Employees emp : list) {
//				System.out.println(emp);
//			}			
//		} finally {
//			DbUtil.sessionClose(session);
//		}	
//	}	
//	
//	
//	public void selectByMaxMin(int min, int max){
//		
//		SqlSession session = null;		
//		try {
//			session = DbUtil.getSession();
//			Map<String, Integer> map = new HashMap<String, Integer>();
//			map.put("min", min);
//			map.put("max", max);
//			List<Employees> list = session.selectList("empSelect.selectByMinMax", map);	
//			for(Employees emp : list) {
//				System.out.println(emp);
//			}			
//		} finally {
//			DbUtil.sessionClose(session);
//		}	
//	}	
//	
//	
//	public void selectByKeyField(String keyField, String keyWord){
//		
//		SqlSession session = null;		
//		try {
//			session = DbUtil.getSession();
//			Map<String, String> map = new HashMap<String, String>();
//			map.put("keyField", keyField);
//			map.put("keyWord", "%"+keyWord+"%");
//			List<Employees> list = session.selectList("emp.selectByKeyField", map);	
//			for(Employees emp : list) {
//				System.out.println(emp);
//			}			
//		} finally {
//			DbUtil.sessionClose(session);
//		}	
//	}	
}	
