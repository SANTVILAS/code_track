package method_ref_durgasir;

interface interf1 {
	public void add(int a, int b);

}

public class Test1 {

	public static void sum(int a, int b) {

		System.out.println("The sum of two no " + (a + b));
	}

	public static void main(String[] args) {
		interf1 i1 = Test1::sum;
		i1.add(10, 20);
	}
}
