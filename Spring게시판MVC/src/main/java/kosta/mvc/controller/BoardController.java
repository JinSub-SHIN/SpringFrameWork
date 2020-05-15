package kosta.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kosta.mvc.domain.BoardDTO;

@Controller
public class BoardController {

	@Autowired
	private List<BoardDTO> list;
	
	@RequestMapping("/list.kosta")
	public void aa(Model model) {
		
		model.addAttribute("list", list); // ${list} 를 할 수 있다..
	}
	
	
	@RequestMapping("{url}.kosta")
	public void url() {}
	
	@PostMapping("/register.kosta")
	public String register(BoardDTO board) {
		
		list.add(board);		
		
		return "redirect:list.kosta";
	}
	
	
	@RequestMapping("/read/{no}.kosta")
	public ModelAndView bb(int no) {
		
		int check = 0;
		
		for(int i=0 ; i<list.size() ; i++) {			
			if (list.get(i).getNo() == no) {				
				check = i;
			}			
		}
				
		ModelAndView mv = new ModelAndView();
		mv.addObject("one" , list.get(check));
		mv.setViewName("read");
		
		return mv;
	}
	
	@RequestMapping("/delete/{no}.kosta")
	public ModelAndView delete(@PathVariable int no) {
		
		for(int i=0 ; i<list.size() ; i++) {			
			if (list.get(i).getNo() == no) {				
				list.remove(i);				
				break;
			}			
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("list");		
		mv.addObject("list" , list);
		
		return mv;
	}
	
	
	@RequestMapping("/registerForm.kosta")
		public void abc() {
						
		}
	}	

