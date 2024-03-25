package Inheritance;

public class VehicleUse {

	public static void main(String[] args) {
//		Vehicle v = new Vehicle();
//		v.setMaxSpeed(100);
//		v.color="Black";
//		v.print();

		Vehicle v = new Car(10, 100);
	//	v.isConvertible(); vis specfic to vehicle qand Vehicle donty have isConvertible
		v.print();
		
		Car c = new Car();
		c.numGears =10;
		c.color ="White";
		c.maxSpeed=100;
		System.out.println();
		c.print();
		
		c.printMaxSpeed();
		
		
		
		
		
	}
	
}
