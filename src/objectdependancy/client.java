package objectdependancy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {
		
ApplicationContext context = new ClassPathXmlApplicationContext("objectdependacybeans.xml");

Student st = context.getBean("student" ,Student.class);

st.cheating();
  AnotherStudent sts = context.getBean("anotherstudent", AnotherStudent.class);
  
  sts.shareCheat();
  
  
	}

}
