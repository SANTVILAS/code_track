package singleton_design_pattern;

class A {
    static A a = null;
    private A() {
		System.out.println("A-Cons");
	}
    static A gerRef() {
		if (a == null) {
			a = new A();
			return a;
		} else {
			return a;
		}

	}

}

class Test_Singleton_OneWay {

	public static void main(String[] args) {
		System.out.println(A.gerRef());
		System.out.println(A.gerRef());
		System.out.println(A.gerRef());

	}

}
