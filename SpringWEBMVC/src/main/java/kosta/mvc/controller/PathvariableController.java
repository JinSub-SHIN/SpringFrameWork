package kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathvariableController {

	@RequestMapping(value = "/{type}/{id}.do")
	public String abc(@PathVariable String type, @PathVariable String id) { // ?type=cafe&id=jang
		
		System.out.println("ÆÐ¶ß¹ß¸®¾ÆºíÄÁÆ®·Ñ·¯ abc() ½ÇÇàµÊ...");
		System.out.println("type : " + type);
		System.out.println("id : " + id);
				
		return "result";
	}
	
	@RequestMapping(value = "/{id}")
	public String bb(@PathVariable String id) {
		System.out.println("»©¶ß¹ß¸®¾ÆºíÄÁÆ®·Ñ·¯ bb() ½ÇÇàµÊ...");
		System.out.println("id : " + id);
		
		return "reuslt";
	}
	
	@RequestMapping(value = {"/board/{name}/{num}"})
	public String ad(@PathVariable(name = "name") String ho, @PathVariable int num) {
		System.out.println("»©¶ß»¡¸®¾ÆºíÄÁÆ®·Ñ·¯ ad() ½ÇÇàµÊ...");
		
		System.out.println("name : " + ho);
		System.out.println("num : " + num);		
		
		return "result";
		
	}
	
	@RequestMapping("{url}")
	public void url() {
		
	}
	
}
