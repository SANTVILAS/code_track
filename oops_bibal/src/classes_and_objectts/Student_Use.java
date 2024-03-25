package classes_and_objectts;

public class Student_Use {

	
	public static void main(String[] args) {
		Student s1 = new Student("santvilas",11);
		System.out.println(s1);
		s1.print();
//		System.out.println(s1.getName());
//		System.out.println(s1.getRollNumber());
//		
		Student s2 = new Student("Monu",63);
		System.out.println(s2);
//		System.out.println(s2.getName());
//		System.out.println(s2.getRollNumber());
		
		s2.print();
		
		System.out.println(s1.getNumStudent());
		System.out.println(s1.getNumStudent());
		System.out.println(Student.getNumStudent());
		System.out.println(s1.name);
		System.out.println(s2.name);
	}
}
