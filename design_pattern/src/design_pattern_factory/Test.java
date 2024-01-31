package design_pattern_factory;

class A {
	private A() {
		System.out.println("A-con");
	}

	void m1() {
		System.out.println("M1-A");
	}

	static A getRef() {

		A a = new A();
		return a;
	}
}

public class Test {
	public static void main(String[] args) {
     A a=A.getRef();
     a.m1();
	}

}
