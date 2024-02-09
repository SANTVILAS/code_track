package java8_predicate;

import java.util.Iterator;
import java.util.function.Predicate;

public class Test2 {
	
	public static void main(String[] args) {
		int[] x= {0,10,13,15,20,40};
		Predicate<Integer> P1 = I->I%2==0;
		Predicate<Integer> P2 = I->I>10;
		System.out.println("The no is even and greater than 10");
		for(Integer x1:x) {
			if(P1.and(P2).test(x1)) {
				System.out.println(x1);
			}
		}
		
 		
	}

}
