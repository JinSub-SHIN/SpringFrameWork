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
		
		System.out.println("rem/a.do �� ��û�Ǿ����ϴ�....");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result"); // WEB-INF/views/result.jsp �� �̵�..
		mv.addObject("message", "�ű��ϱ�");
		mv.addObject("id", "������");
		return mv;
	}
	
	/*
	 *  �������� ��û�� ���� �޼ҵ带 ȣ��.. (Controller)
	 *  @param : Model�� �信 ���޵� ��ü
	 *  @return : String�� ���� �̸��̵ȴ�.
	 */
	@RequestMapping(value = {"/b.do", "/c.do"})
	public String cc(Model model) {
		
		System.out.println("�������� ��û�� ���� �޼ҵ�(Controller)�� ȣ���...");
		model.addAttribute("message", "�𵨷� ���� �޽���..");
		model.addAttribute("id", "�ʿ��Ѱ� �Ű������� ������ �ȴٰ�?");
		
		return "result"; // �� �̸��� �ȴ�..
	}	
	
	/*
	 *  ��û���(GET or POST or PUT or DELETE) �� ���� �ٸ� �޼ҵ� ȣ��..
	 *  @return : void �� ���, ��û�̸��� ���� �̸��� �ȴ�..
	 *  ���� ��� rem/test.do �� ��û�Ǹ�.. 
	 *  WEB-INF/views/rem/test.jsp �� �̵��Ѵ�.
	 */
	@PostMapping("/test.do")
	public void aaa(HttpServletRequest request) {
		String name = request.getParameter("name");
		System.out.println("post��� test.do�� ��û�Ǿ����ϴ�  name = " + name);				
	}
	
	@GetMapping("/test.do")
	public void abc(String name) {
		System.out.println("get��� test.do�� ��û�Ǿ����ϴ� name = " + name);
	}
	
	/*
	 *  parameter ������ ���� Mapping ó���ϱ�..
	 */
	@RequestMapping(value = "a.do" , params = {"id=jang"})
	public void fff() {
		
		System.out.println("a.do�� �Ķ���� ������ ���� Mapping.....");
		
	}
	
	
	
	
}