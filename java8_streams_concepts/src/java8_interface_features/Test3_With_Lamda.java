package java8_interface_features;

interface interf3{
	public void sum(int a, int b);
}


public class Test3_With_Lamda {
public static void main(String[] args) {
	interf3 i= (a,b)->System.out.println(a+b);
	i.sum(10,20);
		
	
}
}
