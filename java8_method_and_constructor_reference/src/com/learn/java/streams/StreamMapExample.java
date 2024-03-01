package com.learn.java.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.java.data.StudentDataBase;
import com.learn.java.data.Student;

public class StreamMapExample {

	public static List<String> nameList() {// Stream<Student>
		// Student as input ==>Student name
		List<String> studentList = StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getName) // Stream<String>
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		return studentList;
	}

	public static void main(String[] args) {
		System.out.println(nameList());
	}

}
