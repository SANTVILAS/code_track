package java8_predicate;

import java.util.Iterator;
import java.util.function.Predicate;

public class Check_length_of_String {

	public static void main(String[] args) {
		
		Predicate<String> P2 = S->S.length()>5;
		System.out.println(P2.test("Santvilas"));
		
		String[] str = {"Santvilas","Hansvilas","Prem","Monu","Premvilas"};
		Predicate<String> P3 = S->S.length()>5;
		for(String S1:str) {
			if(P3.test(S1)) {
				System.out.println(S1);
			}
		}
	}
	
}
