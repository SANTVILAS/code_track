package com.codingninja.star_pattern;


//1
//12
//123
//1234

public class Pattern1 {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=4) {
			int j=1;
			while(j<=i) {
				System.out.print(j);
				 j++;
			 }
			System.out.println();
			i++;
		}
	}
}
