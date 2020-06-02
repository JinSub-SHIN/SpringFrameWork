package kosta.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kosta.mvc.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

	/**
	 *  메소드 기반 쿼리 만들기
	 */
	List<Board> findByBnoGreaterThan(Long bno);	
	
}
