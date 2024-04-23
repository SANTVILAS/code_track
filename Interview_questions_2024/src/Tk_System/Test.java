package Tk_System;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Create a map of frequency count of each character of given string using streams and 
//then sort it on the basis of keys .
//String s = "ssssddddffffggghhhh"


public class Test {

	public static void main(String[] args) {
		String s = "ssssddddffffggghhhh";
		 String[] str=s.split("");
		   
	Map<String, Long> mapAnswer= Arrays.stream(str).sorted().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));  
		  System.out.println(mapAnswer);
		  
		  List<String> answer= Arrays.stream(str).sorted((I1,I2)->I1.compareTo(I2)).collect(Collectors.toList());
		  System.out.println(answer);
		
	}
	
	
	
}
