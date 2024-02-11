package constructor_ref;

interface interf {
	public Sample get();
}

class Sample {

	Sample() {
		System.out.println("Sample Cons");
	}

}

public class Test {

	public static void main(String[] args) {
		interf f = Sample::new;
		f.get();

	}

}
