package coding_ninja;

public class Test03_Simple_Reverse_String {
public static void main(String[] args) {
	
	String str = "Santvilas";
	
	String reverse ="";
	for(int i=str.length()-1;i>=0;i--) {
     reverse = reverse +str.charAt(i);
     
	}
	System.out.println(reverse);
}
}
