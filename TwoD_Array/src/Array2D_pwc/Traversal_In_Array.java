package Array2D_pwc;

import java.util.Scanner;

public class Traversal_In_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		
		int m=arr.length;
		int n=arr[0].length;
		
		System.out.println(m);
		System.out.println(n);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}

		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
