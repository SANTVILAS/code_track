import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates_2 {

	public static ArrayList<Integer> removeDuplicates(int arr[]) {
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer, Boolean> seen = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (seen.containsKey(arr[i])) {
				continue;
			}

			output.add(arr[i]);
			seen.put(arr[i], true);
		}
		return output;
	}

	public static void main(String[] args) {
		

		int arr[] = { 1, 2, 5, 3, 2, 1, 6, 4, 3 };
		ArrayList<Integer> output = removeDuplicates(arr);
		for (int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}

	}

}
