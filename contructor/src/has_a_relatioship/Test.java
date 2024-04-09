package has_a_relatioship;

public class Test {
	public static void main(String[] args) {

		Collage c1 = new Collage("DAVV", "Indore");
		
		Student s1 = new Student(111,"santvilas", c1);
		Student s2 = new Student(222,"vilas", c1);
		
		System.out.println(s1);
	    System.out.println(s2); 
	}
}
