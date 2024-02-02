package singleton_design_pattern;

class C {

	static C c = new C();
	private C() {

	}
	static C getRef() {
		return c;
	}
}

public class Test_Singleton_ThirdWay {

	public static void main(String[] args) {
		System.out.println(C.getRef());
		System.out.println(C.getRef());
		System.out.println(C.getRef());
	}
}
