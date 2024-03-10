package coding_ninja;

public class String_Valid_Palindrome {

	public static boolean isPalindrome(String s) {
	  //i need to remove space and character and upper and lowercase thing

	        String str = s.toLowerCase();
	        StringBuffer b = new StringBuffer();
	        for(int i=0;i<str.length();i++) {
	        	if(Character.isDigit(s.charAt(i))   ||Character.isLetter(s.charAt(i)) ) {
	        		b.append(s.charAt(i));
	        		
	        	}
	           System.out.println(b);
	        		int start=0;
	        		int end=str.length()-1;
	        		
	        		while(start<end) {
	        			if(str.charAt(start)!=str.charAt(end)) {
	        				return false;
	        			}else {
	        				start++;
	        				end--;
	        			}
	        		}
	        	}
	        return true;
  }

	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		boolean ans=isPalindrome(str);
		System.out.println(ans);
	}

}
