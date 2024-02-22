package pw_skills_Arrays;

public class Test1 {
public static void main(String[] args) {
	int x = 0;
	int a = x++;
	System.out.println("AAAAAA "+x++);
	System.out.println("bbbbb "+a);
	int b = x++;
	System.out.println(b);
	int c = x++;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	
	System.out.println("========================");
	System.out.println(a+b+c);
	
}
}
