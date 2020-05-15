package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController {
	
	@RequestMapping("/exception.do")
	public String exception(String no) {
		System.out.println("익셉션컨트롤러 익셉션 호출됨...");
		int converNo = Integer.parseInt(no);
		
		int result = 100/converNo;
		System.out.println("나눈 결과 : " + result);
		
		return "result"; // WEB-INF/views/result.jsp 이동한다.
	}
	
	/*
	 *  현재 Controller에서 예외가 발생하면 처리 해줄 메소드
	 */
//	@ExceptionHandler(NumberFormatException.class)
	@ExceptionHandler({NumberFormatException.class , ArithmeticException.class})
	public ModelAndView error(Exception e) {
		
		System.out.println("예외가 났을때 해야할일을 합니다...");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error/errorView");
		mv.addObject("errMsg" , e.getMessage());
		mv.addObject("errInfo" , e.getClass()+"에서 발생했어요");
		
		return mv;
	}
	
}
