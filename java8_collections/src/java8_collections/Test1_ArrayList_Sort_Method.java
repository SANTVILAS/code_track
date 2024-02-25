package java8_collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test1_ArrayList_Sort_Method {

public static void main(String[] args) {
	
	ArrayList<Integer> l=new ArrayList<>();
	l.add(10);
	l.add(0);
	l.add(5);
	l.add(12);
	l.add(15);
	System.out.println("Before Soerting");
	System.out.println(l);
	System.out.println("After Sorting");
	Collections.sort(l);
	System.out.println(l);
}
	
}
