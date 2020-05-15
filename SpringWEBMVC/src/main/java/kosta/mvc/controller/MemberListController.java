package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kosta.mvc.domain.MemberListDTO;

@Controller
public class MemberListController {

	@RequestMapping("/list/memberMulti.do")
	public ModelAndView list(MemberListDTO member) {
		
		System.out.println("MemberListController¿« list»£√‚µ ...");
		
		return new ModelAndView("listResult" , "message" , "ø¿¥√¿∫ ∏Òø‰¿œ..");
	}
}
