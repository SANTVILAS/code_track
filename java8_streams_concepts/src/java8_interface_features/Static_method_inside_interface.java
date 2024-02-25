package java8_interface_features;

interface I{
	static void m1() {
		System.out.println("This is m1 mthod");
	}
	
static void m2() {
		System.out.println("This is m2 method");
	}
	
}

public class Static_method_inside_interface {
public static void main(String[] args) {
	I.m1();
	I.m2();
}

}
