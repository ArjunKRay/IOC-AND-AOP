package college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class College {
  public static void main(String[] args	) {
	   
	  ApplicationContext context = new ClassPathXmlApplicationContext("collegebeans.xml");
	 Student st = context.getBean("student",Student.class);
	 st.display();
	 
  }
}
