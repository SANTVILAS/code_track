package java8_filters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2_Filterand_Map {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("santvilaskeshari");
		al.add("premvilaskeshari");
		al.add("Hansvilaskeshari");
		al.add("santvila");
		al.add("vilas");
		System.out.println(al);

		List<String> l1 = al.stream().filter(I -> I.length() > 9).collect(Collectors.toList());
		System.out.println(l1);
		List<String> l2 = al.stream().map(I -> I.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
        long ans=l1.stream().filter(I->I.length()>9).count();
        System.out.println(ans);
	}

}
