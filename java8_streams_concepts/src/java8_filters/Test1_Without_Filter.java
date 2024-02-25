package java8_filters;

import java.util.ArrayList;

public class Test1_Without_Filter {

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> list =new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.println(list);
		
		//Here Integer is object, we are interating over objects
		
		
		ArrayList<Integer> l1 =new ArrayList<Integer>();
		for (Integer integer : list) {
			if(integer % 2==0) {
				l1.add(integer);
			}
		}
		System.out.println(l1);
	}
	
}
