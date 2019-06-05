package rgpv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class College {
	@Value("${college.studentName}")
	String studentName;
	
	@Value("Radharaman")
	String collegeName;
	
	
	@Autowired
	private Principal principal;
@Autowired
	private Teacher teacher;

/* 	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	*/
	  public void test() {
	 principal.principalInfo();
 
		teacher.teach();
		  
		  System.out.println("college name is :"+ collegeName);
		  
	  }
	  
	  
	

}
