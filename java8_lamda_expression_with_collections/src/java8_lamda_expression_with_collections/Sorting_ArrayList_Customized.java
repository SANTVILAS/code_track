package java8_lamda_expression_with_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer I1, Integer I2) {
		
//		if(I1<I2) {
//			return -1;
//		}else if(I1>I2){
//			return +1;
//		}else {
//			return 0;
//		}
		
		return (I1<I2)?-1:(I1>I2)?1:0;
		
	}
	
}
public class Sorting_ArrayList_Customized {
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(40);
		l.add(10);
		l.add(15);
		l.add(5);
		System.out.println(l);
		Collections.sort(l,new MyComparator());
		System.out.println(l);
		
	}

}
