package kosta.orm.domain;

import kosta.orm.repository.JoinDAO;

public class MainApp {

	public static void main(String[] args) {
		
		JoinDAO jdao = new JoinDAO();
		
//		jdao.association();
		
//		jdao.collection();
		
		
		jdao.userCollection();
		
	}
	
}
