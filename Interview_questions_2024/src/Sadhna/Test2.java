package Sadhna;
//


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {

	//get the character frequency count using java 8 stream.
	
	public static void main(String[] args) {
		String s = "abbcadab";
		   String[] str=s.split("");
		   
		   
		   
		   Map<String, Long> ans=Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		   
		   System.out.println(ans);
		ans.entrySet().forEach((key,value)->System.out.println(S));
	Set<String> setans= Arrays.stream(str).filter(i->Collectors.frequecy(List,1)<=2).collect(Collectors.toSet());
		   System.out.println(setans);
	}
	
}
