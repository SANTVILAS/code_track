package pw_skills_array_basics;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();

		// declaring an arry
		int arr[] = new int[n];
		// iterating on array

		for (int i = 0; i <= n - 1; i++) {
			arr[i] = s.nextInt();
		}

		for (int i = 0; i <= n - 1; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
