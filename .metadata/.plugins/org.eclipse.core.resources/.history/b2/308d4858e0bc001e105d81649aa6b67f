package bit_wise_coding_ninja;

import java.util.Scanner;

public class DecimalToBinary {

//	public static String decimalToBinary(int n) {
//		int N = 45;
//		String b = "";
//		while (N >= 1) {
//			int x = N % 2;
//			N = N / 2;
//			b = x + b;
//		}
//		return b;
//	}
	
	
	public static int decimalToBinary(int N) {
		int ans=0;
		int pv=1;
		while(N!=0) {
		int remainder=N%2;
		N=N/2;
		ans = ans + remainder * pv;
		pv*=10;
		}
		return ans;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	//	String ans = decimalToBinary(45);
		int ans=decimalToBinary(45);
		System.out.println(ans);

	}
}
