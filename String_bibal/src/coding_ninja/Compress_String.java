package coding_ninja;

public class Compress_String {
	
	public static String compressString(String str) {
	
		char[] ch=str.toCharArray();
		char starttingIndex = ch[0];
		int counter = 1;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==ch[i+1]) {
				counter++;
			}else {
				starttingIndex=ch[i+1];
				counter =1;
			}
			System.out.println(ch[i]+counter);
		}
		return "";
	}
	
	public static void main(String[] args) {
		String str = "aaabbccdsa";
	   compressString (str);
	   
	}

}
