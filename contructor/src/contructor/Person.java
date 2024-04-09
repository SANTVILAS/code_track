package contructor;

public class Person {

	private int personId;
	private String personName;

	public Person() {
		personId = 11;
		personName = "Santvilas";
	}

	
	public void diplayDetails() {
		System.out.println("Person Id "+personId);
		System.out.println("Person Name "+personName);
	}
}
