package java8_map;

import java.util.ArrayList;

public class Test1_Map_Without_Stream {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		System.out.println(al);
		
		ArrayList<Integer> l1=new ArrayList<>();
		for(Integer elem : al) {
			//elem =elem * 2;
			l1.add(elem *2);
		}
		System.out.println(l1);
		
	}
}
