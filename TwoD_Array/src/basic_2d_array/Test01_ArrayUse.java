package basic_2d_array;

import java.util.Scanner;

public class Test01_ArrayUse {

	public static void main(String[] args) {

//		int arr2d[][] = new int[3][4];
//		System.out.println(arr2d[1][1]);
//		arr2d[2][0]=15;
//		System.out.println(arr2d[2][0]);
//		
//		
//		int arr[][] = {{1,2,3},{4,5,6,}};

		Scanner s = new Scanner(System.in);
		System.out.print("Number of rows ");
		int rows = s.nextInt();
		System.out.print("Number of column ");
		int cols = s.nextInt();

		int input[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Enter element at " + i + " row " + j + " columns ");
				input[i][j] = s.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}

	}

}
