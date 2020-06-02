package kosta.mvc;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import kosta.mvc.domain.Board;
import kosta.mvc.repository.BoardRepository;

@SpringBootTest
class BoardRepositoryTests {

	@Autowired
	private BoardRepository rep;
	
	/**
	 *  등록
	 */
	@Test
	public void insert() {
		System.out.println("insert....");
		for(int i=0; i<200 ; i++) {
		rep.save(new Board(null, "제목"+i, "user"+i, "springJPA"+i , null));
		}
	}
	
	
	/**
	 *  전체검색
	 */
	@Test
	public void selectAll() {
		List<Board> list = rep.findAll();
//		for(Board b : list) {
//			System.out.println(b);
//		}
		list.forEach(b -> System.out.println(b));
		
		
	}
	
	/**
	 *  글번호에 해당하는 검색
	 */
	@Test
	public void find() {
		Board board = rep.findById(177L).orElse(null);
		System.out.println(board);
	}	
	
	/**
	 *  삭제...
	 */
	@Test
	public void delete() {
		rep.deleteById(20L);
	}
	
	/**
	 *  수정하기
	 */
	@Test
	public void update() {
		
		Board board = rep.findById(30L).orElse(null);
		if(board!=null) {
			board.setContent("집에가고프다");
			board.setTitle("업데이트제목");
			rep.save(board);
		}		
	}

	
	@Test
	public void findTest() {
		List<Board> list = rep.findByBnoGreaterThan(180L);
		list.forEach(b -> System.out.println(b));
		
	}
	
	@Test
	public void page() {
		Pageable page = PageRequest.of(1, 10);
		Page<Board> pageList = rep.findAll(page);
		pageList.getContent().forEach(b->System.out.println(b));
	}
	
}
