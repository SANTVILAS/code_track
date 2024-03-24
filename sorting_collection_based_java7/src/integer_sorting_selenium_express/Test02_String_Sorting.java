package integer_sorting_selenium_express;

import java.util.ArrayList;
import java.util.Collections;

import MyUtility.MyUtil;

public class Test02_String_Sorting {
//	private static void interateString(ArrayList<String> musicList) {
//		for(String x:musicList) {
//			System.out.println(x);
//		}
//	}

	public static void main(String[] args) {

		ArrayList<String> musicList = new ArrayList<String>();

		musicList.add("aye mere humn safar");
		musicList.add("bil toh pagal hai");
		musicList.add("Dil wil pyar vyar");
		musicList.add("o re piya");
		musicList.add("kinna Sona");

//	for(String x:musicList) {
//		System.out.println(x);
//	}
		MyUtil.interateList(musicList);
        Collections.sort(musicList);
		System.out.println("After sorting================");
		MyUtil.interateList(musicList);
		
		
//	for(String x:musicList) {
//		System.out.println(x);
//		
//	}

	}

}
