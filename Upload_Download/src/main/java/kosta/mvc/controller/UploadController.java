package kosta.mvc.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import kosta.mvc.domain.UploadDTO;

@Controller
public class UploadController {

	/**
	 * 매겨변수로 MultipartFile를 주입 받으려면..
	 * xml문서에 CommonsMultipartResolver 설정 필요하다.
	 * @param name
	 * @param file
	 * @return
	 */
	@RequestMapping("/upload.do")
	public ModelAndView updown(String name, MultipartFile file, HttpSession session) { // <- input type="file" name="file" <<- name 값이랑 같아야한다...
		
		String path = session.getServletContext().getRealPath("/WEB-INF/save");
		
		// 저장할 파일이름
		String fileName = file.getOriginalFilename();
		
		try {
			file.transferTo(new File(path+"/"+fileName));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		
		// 뷰쪽으로 첨부된 파일의 정보를 가져간다..
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("uploadResult");
		mv.addObject("name", name);
		mv.addObject("fileName", fileName);
		mv.addObject("fileSize", file.getSize());
		mv.addObject("path", path);
		
		return mv;
	}
	
	/**
	 * 
	 */
	@PostMapping("/upload2.do")
	public String bb(UploadDTO dto, HttpSession session) {
		
		String path = session.getServletContext().getRealPath("/WEB-INF/save");
		
		session.setAttribute("path2", path);
		
		MultipartFile file = dto.getFile();
		
		// 실제 업로드..
		
		dto.setFileName(file.getOriginalFilename());
		dto.setFileSize(file.getSize());
		
		try {
			dto.getFile().transferTo(new File(path+"/"+dto.getFileName()));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return "uploadResult";
	}
	
	/*
	 *  다운로드 목록 가져오기
	 */
	@RequestMapping("/downList.do")
	public ModelAndView down(HttpSession session) {
		
		// save폴더안에 있는 모든 목록(파일이름) 을 가져온다.
		String path = session.getServletContext().getRealPath("/WEB-INF/save");
		
		File file = new File(path);
		ModelAndView mv = new ModelAndView();
		
		if(file.exists()) {			
			// 파일이 존재한다면
			String [] fileNames = file.list();
			mv.addObject("fileNames", fileNames);			
		}		
		mv.setViewName("downList");
			
		return mv;
	}
	
	@RequestMapping("/down.do")
	public ModelAndView abc(String fname, HttpSession session) {
		
		String path = session.getServletContext().getRealPath("/WEB-INF/save");
		File file = new File(path+"/"+fname);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("downLoadView");
		mv.addObject("fname", file);
		
		return mv;
	}
	
	
}
