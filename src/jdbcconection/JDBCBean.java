package jdbcconection;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JDBCBean {
	
	   @Value("${jdbc.driverName}")
	
   private String driverName;
   
  
   @Value("${jdbc.url}")
   private  String url;
   
   @Value("${jdbc.password}" )
   
   private String password;
   
   @Value("${jdbc.userName}")
   private   String userName;
   
   
   public void display() {
	   
	   System.out.println("jdbc.."+ url+"" +password+""+ driverName+"" +userName);
	   
   }
   
   public  void JDBCConection() {try {
	   
	Class.forName(driverName);
	
	   Connection con = DriverManager.getConnection(url,userName,password);
	   
	   System.out.println("connection is done" +con); 
	   
   }
   
   catch(Exception e) { 
	   System.out.println(e);
   }
   

   }
   
}
