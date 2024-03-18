import java.util.HashMap;

public class MapTest_1 {
public static void main(String[] args) {
	
	HashMap<String, String> map=new HashMap<String, String>();
	map.put("firstName", "Sant");
	map.put("lastName", "vilas");
	map.put("lastName", "keshari");
	
	System.out.println(map);
	System.out.println(map.put("firstName", "Sant"));
//	System.out.println("1");
//	System.out.println(map.put("lastName", "vilas"));
	System.out.println("2");
	System.out.println(map.put("lastName", "Monu"));
	System.out.println(map);
	
	
	
}
}
