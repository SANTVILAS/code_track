package method_ref_durgasir;

interface interf {
	public void m1();
}

public class Test {

	public static void m2() {
		System.out.println("Method Reference");
	}

	public static void main(String[] args) {
        interf i = Test::m2;
        i.m1();
	}
}
