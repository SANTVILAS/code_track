package java8_interface_features;

interface inferf2 {
	public void sum(int a, int b);
}

class Demo2 implements inferf2 {

	@Override
	public void sum(int a, int b) {
		System.out.println(a + b);

	}

}

public class Test3_Without_Lamda {
	public static void main(String[] args) {
     inferf2 i = new Demo2();
     i.sum(10, 20);
	}
}
