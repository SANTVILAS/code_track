package pw_skills_array_basics;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };

		System.out.println(arr.length);

		System.out.println("==================================");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i <= n - 1; i++) {
			System.out.print(arr[i] + " ");
        }
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
        }

	}

}
