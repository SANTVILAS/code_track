package com.learnjava.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamCompartorExample {

	public static List<Student> sortStudentByname(){
		 return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentByGPA(){
		 return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa))
		.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentByGPAReverse(){
		 return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa).reversed())
		.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println("Student sorted by name ");
		sortStudentByname().forEach(System.out::println);
		
		System.out.println("Student sorted by GPA ");
		sortStudentByGPA().forEach(System.out::println);
		
		System.out.println("Student sorted by GPA Desc ");
		sortStudentByGPAReverse().forEach(System.out::println);
	}
}
