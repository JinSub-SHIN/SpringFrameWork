package kosta.orm.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kosta.orm.domain.Employees;

public class EmpDAO {

	/*
	 *  IF문 test
	 */
	public void ifTest(Employees emp) {
		
		SqlSession session = null;
		
		try {		
			session = DbUtil.getSession();
			List<Employees> list = session.selectList("dynamic.ifSelect" , emp);
			for(Employees e : list) {
				System.out.println(e);
			}			
			
		} finally {
			DbUtil.sessionClose(session);
		}
		
	}
	
	public void setTest(Employees emp) {
		
		SqlSession session = null;
		boolean state = false;
		
		try {		
			session = DbUtil.getSession();
			state = session.update("dynamic.setUpdate" , emp) > 0 ? true : false;
			
		} finally {
			DbUtil.sessionClose(session, state);
		}
		
	}
	
	public void forEachTest(List<Integer> parmlist) {
		
		SqlSession session = null;
		
		try {		
			session = DbUtil.getSession();
			List<Employees> list = session.selectList("dynamic.forSelect" , parmlist);
			for(Employees e : list) {
				System.out.println(e);
			}			
			
		} finally {
			DbUtil.sessionClose(session);
		}
		
	}
	
	
}
