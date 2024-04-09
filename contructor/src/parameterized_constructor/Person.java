package parameterized_constructor;

public class Person {

	private int personId;
	private String personName;

	public Person() {
		personId = 11;
		personName = "Santvilas";
	}
	
	public Person(int personId,String personName) {
		this.personId =personId;
		this.personName = personName;
	}

	
	public void diplayDetails() {
		System.out.println("Person Id "+personId);
		System.out.println("Person Name "+personName);
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	
	
}
