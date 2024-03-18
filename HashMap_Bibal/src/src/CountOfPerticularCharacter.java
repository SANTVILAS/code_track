package src;

import java.util.HashMap;

public class CountOfPerticularCharacter {
public static void main(String[] args) {
	
	String str="aaacccbbeeeee";
	
	char[] ch=str.toCharArray();
     
	HashMap<Character,Integer> map=new HashMap<>();
	for(char c:ch) {
	
	//	System.out.println("Hey");
		
		if(map.get(c)==null){
			map.put(c, 1);
		}
		else {
		
		   map.put(c, map.get(c)+1);	
		}
	}
	
	System.out.println(map);
}
}
