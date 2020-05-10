package sample04;

public class StudentController {

	private StudentService service;
	private Student student;
	
	public StudentController() {
		System.out.println("StudentController 호출됨...");
	}	
	
	public void setService(StudentService service) {
		System.out.println("setService(StudentService service) call " + service);
		this.service = service;
	}
	
	public void setStudent(Student student) {
		System.out.println("setStudent(Student student) call " + student);
		this.student = student;
	}
	
	public void insert() {
		
		// 서비스의 insert 호출한다...
		service.serviceInsert(student);
		
	}
	
}
