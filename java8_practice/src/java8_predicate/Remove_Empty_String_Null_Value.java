package java8_predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Remove_Empty_String_Null_Value {

	public static void main(String[] args) {
		String[] names = { "Durga", "", null, "Sant", "vilas" };
		Predicate<String> p1 = S -> S != null && S.length() != 0;
		ArrayList<String> l = new ArrayList<String>();
		for (String x : names) {
			if (p1.test(x)) {
				l.add(x);

			}

		}
      System.out.println(l);
	}

}
