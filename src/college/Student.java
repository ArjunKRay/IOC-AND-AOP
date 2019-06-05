package college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class Student {

private String iterestCourse;
private String hobbies;
private String name;

@Value("arjun")
public void setName(String name) {
	this.name = name;
}
@Value("ece")
public void setIterestCourse(String iterestCourse) {
	this.iterestCourse = iterestCourse;
}@Value("cricket")
public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
}



public void display () {
	
	System.out.println("student info: "+name+" hobby:  "+hobbies +" course: "+iterestCourse);
}
}
