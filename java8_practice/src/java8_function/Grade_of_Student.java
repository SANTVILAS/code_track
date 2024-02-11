package java8_function;

import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String ename;
	int marks;

	public Student(String ename, int marks) {
		super();
		this.ename = ename;
		this.marks = marks;
	}

}

public class Grade_of_Student {
	
	public static void main(String[] args) {
		
		Function<Student, String> f=s->{
			
			int marks = s.marks;
			String grade = "";
			if(marks>=80) {
				grade="A[Distiction]";
			}else if(marks>=60) {
				grade="B[Second class class]";
			}else if(marks>=50) {
				grade="C[Trird class class]";
			}else if(marks>=35) {
				grade="D[just pass class]";
			}else {
				grade ="E[Failed]";
			}
			return grade;
			
		};
		
		 Predicate<Student> p = s1->s1.marks>=60;
		Student[] s = { new Student("Santvilas", 100),
				new Student("Santvilas", 70),
				new Student("Santvilas", 40),
				new Student("Santvilas", 30),
				new Student("Santvilas", 30)
				
				
		};
		
		for(Student s1 : s) {
			
			if(p.test(s1)) {
			System.out.println("Student name "+s1.ename);
			System.out.println("Student marks "+s1.marks);
			System.out.println("Student name "+f.apply(s1));
			System.out.println();
			}
		}
	}

}
