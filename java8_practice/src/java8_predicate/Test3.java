package java8_predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test3 {

	public static void main(String[] args) {
		String[] names= {"Sunny","Kajal","Mallika","KK","Katrina"};
		Predicate<String> P1 = S->S.charAt(0)=='K';
		ArrayList<String> l = new ArrayList<String>();
		for(String name:names) {
			if(P1.test(name)) {
				System.out.println(l.add(name));
			}
		}
		
		System.out.println(l);
	}
	
	
}
