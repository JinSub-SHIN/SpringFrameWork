package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rem")
public class RequestMappingController {

	@RequestMapping("/a.do")
	public ModelAndView bb() {
		
		System.out.println("rem/a.do 가 요청되었습니다....");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result"); // WEB-INF/views/result.jsp 로 이동..
		mv.addObject("message", "신기하군");
		mv.addObject("id", "장희정");
		return mv;
	}
	
	/*
	 *  여러개의 요청이 같은 메소드를 호출.. (Controller)
	 *  @param : Model은 뷰에 전달될 객체
	 *  @return : String은 뷰의 이름이된다.
	 */
	@RequestMapping(value = {"/b.do", "/c.do"})
	public String cc(Model model) {
		
		System.out.println("여러개의 요청이 같은 메소드(Controller)가 호출됨...");
		model.addAttribute("message", "모델로 받은 메시지..");
		model.addAttribute("id", "필요한걸 매개변수로 받으면 된다고?");
		
		return "result"; // 뷰 이름이 된다..
	}	
	
	/*
	 *  요청방식(GET or POST or PUT or DELETE) 에 따라 다른 메소드 호출..
	 *  @return : void 인 경우, 요청이름이 뷰의 이름이 된다..
	 *  예를 들어 rem/test.do 로 요청되면.. 
	 *  WEB-INF/views/rem/test.jsp 로 이동한다.
	 */
	@PostMapping("/test.do")
	public void aaa(HttpServletRequest request) {
		String name = request.getParameter("name");
		System.out.println("post방식 test.do가 요청되었습니다  name = " + name);				
	}
	
	@GetMapping("/test.do")
	public void abc(String name) {
		System.out.println("get방식 test.do가 요청되었습니다 name = " + name);
	}
	
	/*
	 *  parameter 정보에 따라 Mapping 처리하기..
	 */
	@RequestMapping(value = "a.do" , params = {"id=jang"})
	public void fff() {
		
		System.out.println("a.do의 파라미터 정보에 따른 Mapping.....");
		
	}
	
	
	
	
}
