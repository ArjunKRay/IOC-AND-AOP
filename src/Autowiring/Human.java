package Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	
	private Heart heart;
	
	
	public Human() {}	;


	public Human(Heart heart) {
	
		this.heart = heart;
	}
	@Autowired
	@Qualifier("humanheart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public void heartpumping()
	
	{
		 if(heart!= null)
		 { 
			 heart.pumping();
		 System.out.println("name of heart "+heart.getNoOfHeart()+"no of heart"+heart.getNoOfHeart());
		 }
		 
		 else {
		 
    System.out.println("sasura tu toh mari gayo ");
   System.out.println("yampuri ja ke pARTY kariyo");  ;
	}
	
	}
}
