package MyUtility;

import java.util.ArrayList;

public class MyUtil {

//	public static void interateIntegerList(ArrayList<Integer> integerList) {
//		for(Integer elem : integerList) {
//		System.out.println(elem);
//	}
//	}
	
	public static <T> void interateList(ArrayList<T> anylist){
		for(T elem : anylist) {
		System.out.println(elem);
	}
	}
	
}
