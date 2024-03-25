package Inheritance;

public class Car extends Vehicle {

	int numGears;
	boolean isConvertible;
	int maxSpeed;
	
	
	
	public Car(int numGears, int maxSpeed) {
		super();
		this.numGears = numGears;
		this.maxSpeed = maxSpeed;
	}

	public Car() {
		System.out.println("car constructor");
	}
	public boolean isConvertible() {
		return isConvertible;
	}

	public void print() {
		System.out.println("Car print function called");
       super.print();
       System.out.println();
       System.out.println("car Function");
		System.out.println("Car numGears :" + numGears);
		System.out.println("Car IsConvertible :" + isConvertible);

	}
	
	public void printMaxSpeed() {
		System.out.println("Car Max Speed "+maxSpeed+" Vehicle max Speed "+super.getMaxSpeed());
		
	}

}
