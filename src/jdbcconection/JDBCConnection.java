package jdbcconection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCConnection {

	public static void main(String[] args) {
		
ApplicationContext context= new ClassPathXmlApplicationContext("jdbcbeans.xml");

JDBCBean bn= context.getBean("jdbc",JDBCBean.class);

bn.display();
bn.JDBCConection();

	}

}
