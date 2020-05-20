package kosta.orm.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employees {

	private int employeeId;
	private String lastName;
	private String email;
	private String hireDate;
	private String jobId;
	private int salary;
	private String phoneNumber;
	
}
