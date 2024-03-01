package com.learnjava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamReduceExample {
	
	//how to get max GPA using reduce method
	
	public static Optional<Student> getHighestGPAStudent(){
		return StudentDataBase.getAllStudents()
		.stream()
		/*.reduce((s1,s2)->{
			if(s1.getGpa()>s2.getGpa()) {
				return s1;
			}else {
				return s2;
			}
		});*/
		.reduce((s1,s2)->(s1.getGpa()>s2.getGpa()) ? s1 :s2);
	}

	public static int performMultiplication(List<Integer> integerList) {
		return integerList.stream()
				// 1
				// 3
				// 5
				// 7
				// a=1,b=1(From stream) ===> result 1 is returned
				// a=1, b=3 (From stream -> 3 is returned)
				// a=3, b=5 (From stream -->15 is returned)
				// a=15, b=7 (From stream ==> 105 is returned)
				.reduce(1, (a, b) -> a * b);

	}

	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> inteList) {
		return inteList.stream().reduce((a, b) -> a * b);
	}
	
	

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 3, 5, 7);
		List<Integer> integer1 = new ArrayList<Integer>();
		System.out.println(performMultiplication(integers));
		Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
		System.out.println(result.isPresent());
		System.out.println(result.get());

		Optional<Integer> result1 = performMultiplicationWithoutIdentity(integer1);

		if (result1.isPresent()) { 
			System.out.println(result1.get());
		}
		//====================================================================
		Optional<Student> studentOptional=getHighestGPAStudent();
		if(getHighestGPAStudent().isPresent()) {
			System.out.println(studentOptional.get());
		}

	}

}
