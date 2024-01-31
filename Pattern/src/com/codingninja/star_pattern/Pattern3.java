package com.codingninja.star_pattern;

import java.util.Scanner;

public class Pattern3 {
  //Good question pattern chages here introdicing new variable
	// 1
	// 12
	// 123
	// 1234
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			int startingNumber = i;
			while (j <= i) {
				System.out.print(startingNumber);
				startingNumber++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
