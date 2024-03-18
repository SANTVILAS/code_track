import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapUse {
public static void main(String[] args) {
	HashMap<String,Integer> map=new HashMap<>();
	map.put("abc", 1);
	map.put("def", 2);
	System.out.println(map.size());
	
	//check Presence
	if(map.containsKey("abc")) {
		System.out.println("Has abc");
	}
	
	
	if(map.containsKey("abc1")) {
		System.out.println("Has abc1");
	}
	
	if(map.containsValue(2)) {
		System.out.println("has two value");
	}
	
	
	//get value

    int v=map.get("abc");
   System.out.println(v);
	
   
//agr key nhi hai toh null return krega
	//int v1=map.get("abc1");==>int v1=null;
    //System.out.println(v);
	
	int v1=0;
	if(map.containsKey("abc1")) {
		v1=map.get("abc1");
		}
	System.out.println(v1);
	
	
	Set<String> keys=map.keySet();
	for(String str:keys) {
		System.out.println(str);
		
	}
}
}
