package toArray;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);

		Integer[] arr = al.stream().toArray(Integer[]::new);
		for (Integer x : arr) {
			System.out.print(x + " ");
		}

	}
}
