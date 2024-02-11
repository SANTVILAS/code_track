package java8_function;

import java.util.function.Function;

//Remove space in given string
public class Test3 {
public static void main(String[] args) {
	String s = "Durga software Solution";
     Function<String, String> f=S->S.replaceAll(" ", "");
     System.out.println(f.apply(s));
}
}


