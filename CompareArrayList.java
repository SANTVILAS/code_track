package Playlist_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareArrayList {

	
	public static void main(String[] args) {
		
		List<String> l1=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		List<String> l2=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		List<String> l3=new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2));//false
		Collections.sort(l3);
		System.out.println(l1.equals(l3));
		
		//compare 2 list find out additional element
		List<String> l4=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		List<String> l5=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		
		
		l4.removeAll(l5);
		System.out.println(l4);
		
		
		
	}
	
}
