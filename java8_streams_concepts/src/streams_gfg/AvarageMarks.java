package streams_gfg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
	
	int roll;
	int marks;
	String name;
	public Student(int roll, int marks, String name) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public int getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
	
}

public class AvarageMarks {
public static void main(String[] args) {
	Student arr[]= {
			new Student(101,70,"abc" ),
			new Student(102,80,"efg"),
			new Student(103,70,"efg" ),
			new Student(104,90,"ijk")
	};
	
	double ans=Arrays.stream(arr)
			.mapToInt(x->x.getMarks())
			.average()
			.getAsDouble();
	System.out.println(ans);
	System.out.println("==============================");
	
	Map<Integer, String> m=Arrays.stream(arr)
			.collect(Collectors.toMap(Student::getRoll, Student::getName));;
			System.out.println(m);
			
			System.out.println("=============================");
			

			Map<Integer, List<Student>> map=Arrays.stream(arr)
					.collect(Collectors.groupingBy(Student::getMarks));
					System.out.println(map);
					
					
			
}
}
