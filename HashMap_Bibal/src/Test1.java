

import java.util.HashMap;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		
		HashMap<String,String> hm=new HashMap<String, String>();
		hm.put("A", "aaa");
		hm.put("B", "bbb");
		hm.put("C", "ccc");
		
		System.out.println(hm);
		
		HashMap<String, String> hm1=new HashMap<String, String>();
		hm1.putAll(hm);
		System.out.println(hm1);
		System.out.println(hm.get("A"));
		System.out.println(hm.containsKey("A"));
		System.out.println(hm.containsValue("BBB"));
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		Set s=hm.keySet();
		System.out.println(s);
		hm.values();
		System.out.println(hm.values());
		
		HashMap<String, String> hm2=new HashMap<String, String>(hm1);
		System.out.println(hm2);
		System.out.println("Byee");
		hm.put(null, "XXX");
		System.out.println(hm);
		hm.put(null, "FFF");
		hm.put("F", "FFF");
		hm.put("L", "FFF");
		System.out.println(hm);
	}	
}
