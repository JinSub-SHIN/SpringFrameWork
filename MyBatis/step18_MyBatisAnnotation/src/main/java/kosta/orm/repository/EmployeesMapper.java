package kosta.orm.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kosta.orm.domain.Employees;

public interface EmployeesMapper {

	/* 
	 *  xml비교
	 *  <select id="메소드이름" parameterType="인수" resultType="리턴타입">
	 *   쿼리
	 *  </>
	 */
	
	/*
	 *  등록하기
	 */
	@Insert("insert into employees(employee_id, last_name, email, hire_date, job_id, salary, phone_number) "
			+ "values(#{employeeId}, #{lastName}, #{email}, sysdate, 'AD_VP', #{salary}, #{phoneNumber})")
	int insert(Employees employees);
	
	/*
	 *  삭제하기
	 */
	@Delete("DELETE FROM EMPLOYEES where EMPLOYEE_ID=#{_parameter}")
	int delete(int employeeId);
	
	/*
	 *  수정하기
	 */
	@Update("UPDATE EMPLOYEES SET LAST_NAME=#${lastName}, email=#{email}, hire_date=sysdate, salary=#{salary} WHERE employee_id=#{employeeId}")
	int update(Employees employees);
		
	/*
	 *  전체검색하기
	 */
	@Select("SELECT employee_id, last_name, email, hire_date, job_id, salary FROM EMPLOYEES")
	@Results(value = {
			@Result(column = "employee_id" , property = "employeeId") ,
			@Result(column = "last_name" , property = "lastName")
	})
	List<Employees> selectAll();
		
	/*
	 *  employee_id로 검색하기
	 */
	@Select("SELECT employee_id, last_name, email, hire_date, job_id, salary FROM EMPLOYEES WHERE employee_id=#{_parameter}")
	Employees selectById(int employeeId);
	
	
	/*
	 *  동적쿼리 검색하기
	 */
	@Select("<script>SELECT employee_id, last_name, email, hire_date, job_id, salary FROM EMPLOYEES " +
			"<trim prefix=\"WHERE\" prefixOverrides=\"OR|AND\">" + 
			"<if test=\"lastName!=null\">" + 
			"last_name=#{lastName}" + 
			"</if>" + 
			"<if test=\"jobId!=null\">" + 
			"AND job_id=#{jobId}" + 
			"</if>" + 
			"</trim></script>")
	List<Employees> ifSelect(Employees employees);
	
}
