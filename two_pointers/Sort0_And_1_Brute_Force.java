package two_pointers;

public class Sort0_And_1_Brute_Force {

	public static void sort0And1(int arr[]) {

		int count_zero = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count_zero++;

			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (i < count_zero) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}

		for (int elem : arr) {
			System.out.print(elem + " ");
		}
		
		System.out.println();

	}

	public static void main(String[] args) {

		int arr[] = { 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 };
		System.out.println("Hello");
		sort0And1(arr);

	}
}
