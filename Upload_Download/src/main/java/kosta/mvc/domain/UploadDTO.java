package kosta.mvc.domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UploadDTO {

	private String name;
	private MultipartFile file; // <- input type = "file" name="file" 이름이랑 같아야한다..
	private String fileName;
	private long fileSize;
	
}
