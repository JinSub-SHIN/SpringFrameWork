package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kosta.mvc.model.domain.Member;
import kosta.mvc.model.service.MemberService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;
	
	/*
	 * �ε���������
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	/*
	 * ȸ��������
	 */
	@RequestMapping("/member/joinForm")
	public void joinForm() {}
	
	
	/*
	 * ȸ�������ϱ�
	 */
	@PostMapping("/member/join")
	public String join(Member member) {		
		memberService.joinMember(member);
		return "/member/joinSuccess";
		
	}
	
	
	@ExceptionHandler(Exception.class)
	public ModelAndView error(Exception e) {		
		return new ModelAndView("error/errorMessage" , "errMsg" , e.getMessage());		
	}
	
	
	/*
	 *  �α��� ��
	 */
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "member/loginForm";
	}
	
	
	/*
	 *  ȸ��/main
	 */
	@RequestMapping("/member/main")
	public void memberMain() {}
	
	/*
	 *  ������/main
	 */
	@RequestMapping("/admin/main")
	public void adminMain() {}
	
	
	
	
	
	
	
	
	
	
}
