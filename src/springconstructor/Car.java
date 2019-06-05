package springconstructor;

public class Car {
  private int model;

 


public Car(int model, String company) {
	
	this.model = model;
	this.company = company;
}

private String  company;

  public void displayCarInfo() {
	  System.out.println(" Car info.." + model+""+company);
	  
  }}