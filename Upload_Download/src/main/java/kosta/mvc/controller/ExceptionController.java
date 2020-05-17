package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController {
	
	@RequestMapping("/exception.do")
	public String exception(String no) {
		System.out.println("�ͼ�����Ʈ�ѷ� �ͼ��� ȣ���...");
		int converNo = Integer.parseInt(no);
		
		int result = 100/converNo;
		System.out.println("���� ��� : " + result);
		
		return "result"; // WEB-INF/views/result.jsp �̵��Ѵ�.
	}
	
	/*
	 *  ���� Controller���� ���ܰ� �߻��ϸ� ó�� ���� �޼ҵ�
	 */
//	@ExceptionHandler(NumberFormatException.class)
	@ExceptionHandler({NumberFormatException.class , ArithmeticException.class})
	public ModelAndView error(Exception e) {
		
		System.out.println("���ܰ� ������ �ؾ������� �մϴ�...");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error/errorView");
		mv.addObject("errMsg" , e.getMessage());
		mv.addObject("errInfo" , e.getClass()+"���� �߻��߾��");
		
		return mv;
	}
	
}
