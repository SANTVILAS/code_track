package com.learnjava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxMinExample {

	public static int findMaxValue(List<Integer> interList) {
		return interList
				//6->y
				//7->y
				//8->y
                //9->y
				//10->y
				.stream()
				.reduce(0, (x, y) -> x > y ? x : y);
		}
	
	public static Optional<Integer> findMaxValueOptional(List<Integer> interList) {
		return interList
				//6->y
				//7->y
				//8->y
                //9->y
				//10->y
				.stream()
				.reduce( (x, y) -> x > y ? x : y);
		}
	

	public static void main(String[] args) {

		//List<Integer> intergerList = Arrays.asList(6, 7, 8, 9, 10);
		List<Integer> intergerList = new ArrayList<Integer>();
		
         int maxValue=findMaxValue(intergerList);
         System.out.println("Max value "+maxValue);
         
       Optional<Integer> maxValueOptional=findMaxValueOptional(intergerList);
       if(maxValueOptional.isPresent()) {
    	   System.out.println("Max value optional :"+maxValueOptional.get());
       }else {
    	   System.out.println("No max value");
       }
	}

}
