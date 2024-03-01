package com.learnjava.streams;

import java.util.List;
import java.util.TooManyListenersException;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamFilterExample {
	
	public static List<Student> filterStdent(){
		
		return StudentDataBase.getAllStudents()
		.stream()//stream<students>
		.filter(student ->student.getGender().equals("female"))
		//filter out send only student who is female
		.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println(filterStdent());
		
	}

}
