package kosta.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class InsertController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("InsertController 요청되었습니다...");
		
		req.setAttribute("message", "Insert의 결과입니다..");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("selectResult"); // ${message}
		
		return mv;
	}

}
