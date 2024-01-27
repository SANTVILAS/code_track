package bit_wise_coding_ninja;

public class BinaryToDecimal {
	
	
	public static int decimalToBinary(int n) {
	 int ans=0;
	 int pv=1;
	 while(n!=0) {
		 int remainder = n%10;
		 ans = ans + pv*remainder;
		 n=n/10;
		 pv*=2;
		 
	 }
		return ans;   
	}
	
	public static void main(String[] args) {
		int n=1011;
		int ans=decimalToBinary(n);
		System.out.println(ans);
		
	}

}
