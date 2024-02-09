package java8_practice_functional_interface;

interface Interf1{
	public void sum(int a, int b);
}

class Demo1 implements Interf1{
 
   public void sum(int a, int b) {
		// TODO Auto-generated method stub
	   System.out.println(a+b);
	}

	
}

public class Addition_Two_Number_without_Lamda_Expression {

	Interf1 i = new Demo1();
     
	
	
}
