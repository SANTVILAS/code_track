package com.codingninja.star_pattern;

import java.util.Scanner;

//1
//23
//456
//78910

public class Pattern4 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int counter = i;
		while (i <= n) {
			int j = 1;
			
			while (j <= i) {
				System.out.print(counter);
				counter++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
