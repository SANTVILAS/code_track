package for_each;

import java.util.ArrayList;
import java.util.List;

public class Test1_Processing {
public static void main(String[] args) {
	
	List<Integer> l=new ArrayList<Integer>();
	
	l.add(10);
	l.add(20);
	l.add(30);
	
	l.stream().forEach(s->System.out.print(" "+s));
}
}
