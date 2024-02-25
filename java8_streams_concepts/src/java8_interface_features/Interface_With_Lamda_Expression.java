package java8_interface_features;

interface interf{
	public void m1();
}

public class Interface_With_Lamda_Expression {
   public static void main(String[] args) {
      interf i= ()->System.out.println("Hello");
      i.m1();
	}
}
