package com.learn.java.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamExample {

	// student name and activities on Map

	public static void main(String[] args) {
		/*
		 * Map<String, List<String>> studentMap=StudentDataBase.getAllStudents()
		 * .stream() .filter(student->student.getGradeLevel()>=3)
		 * .collect(Collectors.toMap(Student::getName, Student::getActivities));
		 * System.out.println(studentMap);
		 */

		// ===============================================================================

		/*
		 * Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>3);
		 * 
		 * Map<String, List<String>> studentMap=StudentDataBase.getAllStudents()
		 * .stream() .filter(studentPredicate)
		 * .collect(Collectors.toMap(Student::getName, Student::getActivities));
		 * System.out.println(studentMap);
		 */

		// ===============================================================================
		Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >= 3);
		Predicate<Student> studentGpaPredicate = (student -> student.getGpa() >= 3.9);

		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
				.filter(studentPredicate)
				.filter(studentGpaPredicate)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(studentMap);
	}
}
