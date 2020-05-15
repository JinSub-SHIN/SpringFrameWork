package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathvariableController {

	@RequestMapping(value = "/{type}/{id}.do")
	public String abc(@PathVariable String type, @PathVariable String id) { // ?type=cafe&id=jang
		
		System.out.println("�ж߹߸��ƺ���Ʈ�ѷ� abc() �����...");
		System.out.println("type : " + type);
		System.out.println("id : " + id);
				
		return "result";
	}
	
	@RequestMapping(value = "/{id}")
	public String bb(@PathVariable String id) {
		System.out.println("���߹߸��ƺ���Ʈ�ѷ� bb() �����...");
		System.out.println("id : " + id);
		
		return "reuslt";
	}
	
	@RequestMapping(value = {"/board/{name}/{num}"})
	public String ad(@PathVariable(name = "name") String ho, @PathVariable int num) {
		System.out.println("���߻����ƺ���Ʈ�ѷ� ad() �����...");
		
		System.out.println("name : " + ho);
		System.out.println("num : " + num);		
		
		return "result";
		
	}
	
	@RequestMapping("{url}")
	public void url() {
		
	}
	
}
