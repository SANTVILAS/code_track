package com.learnjava.streams;
import java.nio.file.DirectoryStream.Filter;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamMapReduceExample {
	
	private static int noOfNoteBook() {
		
		int noOfNoteBooks=StudentDataBase.getAllStudents().stream()
	     .filter(student->student.getGradeLevel()>=3)
	     .filter(student->student.getGender().equals("female"))
		.map(Student::getNotebook)//Stream<integer>
		.reduce(0,(a,b)->(a+b));
		
		return noOfNoteBooks;
	}
	
	public static void main(String[] args) {
  
		
		System.out.println("No of NoteBook "+noOfNoteBook());
	}
}
