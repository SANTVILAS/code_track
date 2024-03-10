package coding_ninja;

public class String_Palindrome {
	
	public static boolean checkPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
			
		}else {
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "madam";
		boolean ans=checkPalindrome(str);
		System.out.println(ans);
	}

}
