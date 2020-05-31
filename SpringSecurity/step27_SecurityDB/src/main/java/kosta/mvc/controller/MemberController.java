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
	 * 인덱스페이지
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	/*
	 * 회원가입폼
	 */
	@RequestMapping("/member/joinForm")
	public void joinForm() {}
	
	
	/*
	 * 회원가입하기
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
	 *  로그인 폼
	 */
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "member/loginForm";
	}
	
	
	/*
	 *  회원/main
	 */
	@RequestMapping("/member/main")
	public void memberMain() {}
	
	/*
	 *  관리자/main
	 */
	@RequestMapping("/admin/main")
	public void adminMain() {}
	
	
	
	
	
	
	
	
	
	
}
