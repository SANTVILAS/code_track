package coding_ninja;

public class Rotate_String_Leetcode {

	public static boolean rotateString(String str,String goal){
        //Strring ko revserse krke originak String me add kr do aur check kro str1.contain(str2)

      String reverse ="";
      for(int i=str.length()-1;i>=0;i--){
           reverse = reverse + str.charAt(i);
      }
      
     String  str1 =str+goal;
      if(str1.contains(str)) {
    	  return true;
      }
   return false;
    }
	
	public static void main(String[] args) {
		boolean ans=rotateString("abcde","edcba");
		System.out.println(ans);
		
		
		
	}

	
}
