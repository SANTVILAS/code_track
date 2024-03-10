package coding_ninja;

public class Reverse_String_Leetcode {
	

	private static char[] reverseChar(char[] s) {
		int counter = 0;
		char[] c= new char[s.length];
		
		for(int i=s.length-1;i>=0;i--) {
			c[counter]=s[i];
			counter++;
		}
		return c;
	}

	
	public static void main(String[] args) {
		char[] s = {'H','e','l','l','o'};
		char[] ans=reverseChar(s);
		
		for(Character c:ans) {
			System.out.print(c+" ");
		}
	}

}
