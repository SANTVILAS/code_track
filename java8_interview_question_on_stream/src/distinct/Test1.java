package distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
public static void main(String[] args) {
	  List<String> list= Arrays.asList("sant","sant","vilas","vilas","keshari","sant", "Monu");
	  List<String> newList=list.stream().distinct().collect(Collectors.toList());
	  
	  System.out.println(newList);
	  
	  System.out.println();
	  
	  newList.forEach(x->System.out.println(x));
}
}
