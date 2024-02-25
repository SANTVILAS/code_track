package custom_object_sorting_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student_Demo {

	public static void main(String[] args) {
		
		List<Student> studentList=Arrays.asList(
				new Student(10, "sant"),
				new Student(30, "vilas"),
				new Student(20, "keshari")
				);
		
		
		List<Student> list1=studentList.stream().sorted(Comparator.comparingInt(Student::getStudentId)).collect(Collectors.toList());
		list1.forEach(s->System.out.println(s));
		
		System.out.println();
		
		List<Student> list2=studentList.stream().sorted(Comparator.comparing(Student::getStuedentName)).collect(Collectors.toList());
		list2.forEach(s->System.out.println(s));
		
		
		
		
		
		
		
	}
}
