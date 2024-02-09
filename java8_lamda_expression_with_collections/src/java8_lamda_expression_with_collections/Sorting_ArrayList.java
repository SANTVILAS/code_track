package java8_lamda_expression_with_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sorting_ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(40);
		l.add(10);
		l.add(15);
		l.add(5);
		System.out.println("Before sorting"+l);
		Collections.sort(l);
        System.out.println("After sorting"+l);
		
		
	}

}
