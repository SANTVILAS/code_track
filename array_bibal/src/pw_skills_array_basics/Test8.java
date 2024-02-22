package pw_skills_array_basics;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the target no....");
		int x = s.nextInt();
		System.out.println("Enter the size of arry");
		int n = s.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				flag = true;
				break;
			}
		}

		if (true) {
			System.out.println("Element found");
		} else {
			System.out.println("Element not found");
		}

	}

}
