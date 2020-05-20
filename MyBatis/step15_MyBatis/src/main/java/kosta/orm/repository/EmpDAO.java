package kosta.orm.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kosta.orm.domain.Employees;

public class EmpDAO {

	public void selectByName() {
		
		SqlSession session = null;
		List<String> list = new ArrayList<String>();
		
		try {		
		session = DbUtil.getSession();
		list = session.selectList("emp.selectByName"); // mapper의 namespace.id
						
		} finally {
			DbUtil.sessionClose(session);			
		}		
		
		for (String str : list) {
			System.out.println(str);
		}

	}
	
	/*
	 *  등록하기
	 */
	public void insert(Employees employees) {
		
		SqlSession session = null;
		boolean state = false;
				
		try {
			session = DbUtil.getSession();
			state = session.insert("emp.empInsert" , employees) > 0 ? true : false;
						
		} finally {
							
			DbUtil.sessionClose(session, state);
		}		
	}
	
	public void delete(int employeeId) {
		
		SqlSession session = null;
		boolean state = false;
				
		try {
			session = DbUtil.getSession();
			state = session.delete("emp.empDelete" , employeeId) > 0 ? true : false;
						
		} finally {
							
			DbUtil.sessionClose(session, state);
		}		
	}
	
	
	public void update(Employees employee) {
		
		SqlSession session = null;
		boolean state = false;
		
		try {
			session = DbUtil.getSession();
			state = session.update("emp.empUpdate", employee) > 0 ? true : false;			
			
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
			list = session.selectList("empSelect.selectAll");	
			
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
			Employees employee = session.selectOne("empSelect.selectByEmpId", employeeId);	
			System.out.println(employee);
			
			
		} finally {
			DbUtil.sessionClose(session);
		}	
	}		
		
	
	/*
	 *  salary가 5000 ~ 10000 사이 검색하기
	 */
	
	
	/*
	 *  특정 컬럼을 기준으로 정렬하기
	 */
	public void selectByOrder(String columnName){
		
		SqlSession session = null;		
		try {
			session = DbUtil.getSession();
			List<Employees> list = session.selectList("empSelect.selectByOrder", columnName);	
			for(Employees emp : list) {
				System.out.println(emp);
			}
			
			
		} finally {
			DbUtil.sessionClose(session);
		}	
	}	
	
	
	/*
	 *  salary를 인수로 전달 받아 salary보다 적게 받는 사원의 정보 검색
	 */
	public void selectWhereSalary(int salary){
		
		SqlSession session = null;		
		try {
			session = DbUtil.getSession();
			List<Employees> list = session.selectList("empSelect.selectWhereSalary", salary);	
			for(Employees emp : list) {
				System.out.println(emp);
			}			
		} finally {
			DbUtil.sessionClose(session);
		}	
	}	
	
	
	public void selectByMaxMin(int min, int max){
		
		SqlSession session = null;		
		try {
			session = DbUtil.getSession();
			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("min", min);
			map.put("max", max);
			List<Employees> list = session.selectList("empSelect.selectByMinMax", map);	
			for(Employees emp : list) {
				System.out.println(emp);
			}			
		} finally {
			DbUtil.sessionClose(session);
		}	
	}	
	
	
	public void selectByKeyField(String keyField, String keyWord){
		
		SqlSession session = null;		
		try {
			session = DbUtil.getSession();
			Map<String, String> map = new HashMap<String, String>();
			map.put("keyField", keyField);
			map.put("keyWord", "%"+keyWord+"%");
			List<Employees> list = session.selectList("emp.selectByKeyField", map);	
			for(Employees emp : list) {
				System.out.println(emp);
			}			
		} finally {
			DbUtil.sessionClose(session);
		}	
	}	
}	
