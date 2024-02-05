package com.codingninja.character_pattern;

import java.util.Scanner;

//AAAA
//BBBB
//CCCC
//DDDD

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print((char)('A'+i-1));
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
	
}
