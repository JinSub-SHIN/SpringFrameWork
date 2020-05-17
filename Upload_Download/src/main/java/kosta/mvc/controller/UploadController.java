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
	 * �Űܺ����� MultipartFile�� ���� ��������..
	 * xml������ CommonsMultipartResolver ���� �ʿ��ϴ�.
	 * @param name
	 * @param file
	 * @return
	 */
	@RequestMapping("/upload.do")
	public ModelAndView updown(String name, MultipartFile file, HttpSession session) { // <- input type="file" name="file" <<- name ���̶� ���ƾ��Ѵ�...
		
		String path = session.getServletContext().getRealPath("/WEB-INF/save");
		
		// ������ �����̸�
		String fileName = file.getOriginalFilename();
		
		try {
			file.transferTo(new File(path+"/"+fileName));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		
		// �������� ÷�ε� ������ ������ ��������..
		
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
		
		// ���� ���ε�..
		
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
	 *  �ٿ�ε� ��� ��������
	 */
	@RequestMapping("/downList.do")
	public ModelAndView down(HttpSession session) {
		
		// save�����ȿ� �ִ� ��� ���(�����̸�) �� �����´�.
		String path = session.getServletContext().getRealPath("/WEB-INF/save");
		
		File file = new File(path);
		ModelAndView mv = new ModelAndView();
		
		if(file.exists()) {			
			// ������ �����Ѵٸ�
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
