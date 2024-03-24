package integer_sorting_selenium_express;

import java.util.ArrayList;
import java.util.Collections;

import MyUtility.MyUtil;

public class Test01_Integer_Sorting {
	
//	private static void interateIntegerList(ArrayList<Integer> integerList) {
//		for(Integer elem : integerList) {
//		System.out.println(elem);
//	}
//	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(15);
		integerList.add(3);
		integerList.add(7);
		integerList.add(1);
		integerList.add(10);
		
		
		
		System.out.println("Before Sorting");
//		for(Integer elem : integerList) {
//			System.out.println(elem);
//		}
		MyUtil.interateList(integerList);
		System.out.println("=============================================");
		System.out.println("After Sorting");
		Collections.sort(integerList);
		
		MyUtil.interateList(integerList);
//		for(Integer elem : integerList) {
//			System.out.println(elem);
//		}
		
	}
	

}
