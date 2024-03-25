package Inheritance;

public class Vehicle {
	
  private int maxSpeed;
 protected String color;
 
 public Vehicle() {
	 System.out.println("Vehicle constructor");
 }
  
  
  public void setMaxSpeed(int maxSpeed) {
	  this.maxSpeed = maxSpeed;
  }
  
  public int getMaxSpeed() {
	  return maxSpeed;
  }
  
  public void print() {
	  
	  System.out.println("Vehicle Function");
	  
	  System.out.println("Vehicle color :"+color);
	  System.out.println("Vehicle Speed :"+maxSpeed);
  }

}
