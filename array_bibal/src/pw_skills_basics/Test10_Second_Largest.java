package pw_skills_basics;



public class Test10_Second_Largest {

	// Complexity of this code is O(n*n)

	public static void main(String[] args) {
		int arr[] = { 34, 55, 66, 35, 74, 95, 23, 43 };

		int mx = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > mx) {
				mx = arr[i];
			}
		}

		int smx = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != mx && arr[i] > smx) {
				smx = arr[i];
			}
		}

		System.out.println(smx);

		System.out.println("=================Second Method with complexity o(n)======================");

		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				second_largest = largest;
				largest = arr[i];
			} else if ((arr[i] < largest) && (arr[i] > second_largest)) {
				second_largest = arr[i];
			}
		}

		System.out.println(second_largest);

	}

}

