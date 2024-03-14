package concept;

import java.util.Arrays;

public class String_To_Array_Conversion_using_tocharArray {
	
	public static void main(String[] args) {
		
		String str ="Hello";
		
		char[] ch=str.toCharArray();
		
		System.out.println(Arrays.toString(ch));
		 System.out.println(str.toCharArray() );
		 
		 System.out.println("===================================");
		 
		 
		 String s = "GeeksforGeeks";
	        char[] gfg = s.toCharArray();
	       
	        for (int i = 0; i < gfg.length; i++) {
	            System.out.print(gfg[i]+" ");
	        }
	}

}
