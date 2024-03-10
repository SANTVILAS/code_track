package coding_ninja;

import java.util.Scanner;

public class Test02_printChar {
	
	public static void printChars(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));;
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		
		printChars(str);

	}

}
