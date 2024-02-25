package java8_interface_features;

interface Interf1 {
	public void m1();
}

class Demo implements Interf1 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Subclass Implementing interface");
	}

}

public class Interface_Without_Lamda_Expression {
	public static void main(String[] args) {
		Interf1 i = new Demo();
         i.m1();
	}
}
