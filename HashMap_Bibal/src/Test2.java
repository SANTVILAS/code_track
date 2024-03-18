

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		
		HashMap<String,String> hm=new HashMap<String, String>();
		hm.put("A", "aaa");
		hm.put("B", "bbb");
		hm.put("C", "ccc");
		
		System.out.println(hm);
		
		Set<Map.Entry<String, String>> s=hm.entrySet();
		Iterator<Map.Entry<String, String>> it=s.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> e=it.next();
			System.out.println(e.getKey()+"  "+e.getValue());
		}
	}	
}
