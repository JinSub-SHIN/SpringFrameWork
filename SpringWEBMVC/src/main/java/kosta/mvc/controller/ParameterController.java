package kosta.mvc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kosta.mvc.domain.Member;


@Controller
@RequestMapping("/param")
public class ParameterController {

	@RequestMapping("/a.do")
	//public ModelAndView aa(String name, int age) {
	  public ModelAndView aa(String name, Integer age) {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		
		return new ModelAndView("result");
	}
	
	/**
	 *  폼으로 전송되는 여러개의 데이터를 domain 객체에 binding 하기..
	 *  parameter 정보로 DTO객체를 받으면 그 정보가
	 *  뷰쪽으로 그대로 전달되어 사용할 수 있다.
	 *  => 뷰페이지에서 속성들을 접근 할때는 객체이름의 첫글자만 소문자로 접근한다.
	 *  ex) Member객체라면 ${member.id}
	 *  
	 *  만약, 사용할 객체의 이름을 변경하고 싶으면
	 *  @ModelAttribute("m") 선언해서 별칭을 만들어서 사용가능
	 *  
	 */
	
	@PostMapping("/c.do")
	public String abcd(@ModelAttribute("m") Member member) {
		
		return "paramResult"; // WEB-INF/views/paramResult.jsp 이동..
	}
	
	/**
	 *  메소드 선언부 위에 @ModelAttribute를 선언하면
	 *  현재 컨트롤러를 들렸다가 뷰로 이동하는 페이지로
	 *  Model정보가 전달된다. 뷰에서 ${} 사용가능..
	 */
	
	@ModelAttribute("msg")
	public String test() {
		
		return "Spring 짱 좋아요^^";
		
	}
	
	@ModelAttribute("hobbys")
	public List<String> test2(){
		
		List<String> list = Arrays.asList(new String [] {"수영", "낚시", "골프", "등산"});
		
		return list;
	}
	
	/**
	 * @RequestParam 는 선언하면 required = "true" 이므로
	 * 반드시 값이 들어와야 한다.
	 * 만약, 값이 없을 수 있다면 defaultValue 를 설정한다.
	 * RequestParam의 id는 아래 param userId와 통한다.
	 * @param userId
	 * @param age
	 */
	@RequestMapping(value = "/d.do")
	public void dd(@RequestParam(name = "id" , defaultValue = "Guest") String userId, @RequestParam(defaultValue = "0") int age) {
		System.out.println("유저아이디 : " + userId);
		System.out.println("유저나이 : " + age);
	}
	
	
}
