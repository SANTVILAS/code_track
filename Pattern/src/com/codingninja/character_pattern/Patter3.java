package com.codingninja.character_pattern;
//

//ABCD
//BCDE
//CDEF
//DEFG

import java.util.Scanner;

// get Starting char and add one

public class Patter3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i = 1;
        while (i <= n) {
			int j = 1;
			int startChar = (char) ('A' + i - 1);
			while (j <= n) {
				System.out.print((char) (startChar));
				startChar = (char)(startChar+1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
