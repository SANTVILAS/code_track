package classes_and_objectts;

public class Student {

	public String name;
	private int rollNumber;
	
	private static int numStudent;
	
	
	public Student(String name,int rollNumber) {
		System.out.println(this);
		this.name=name;
		this.rollNumber=rollNumber;
		numStudent++;
		
	}
	
	
	public static int getNumStudent() {
		return numStudent;
	}
	
	public void setName(String name) {
		name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setRollNumber(int rn) {
		rollNumber = rn;
	}

	public int getRollNumber() {
		return rollNumber;
	}
	
	public void print() {
		System.out.println(name+ "  " +rollNumber );
	}

}
