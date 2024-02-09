package java8_practice_functional_interface;

interface I{
	public void sum(int a, int b);
} 
public class Addition_Of_number_With_Lamda_Expression {

	public static void main(String[] args) {
		I i=(a,b)->System.out.println((a+b));
		i.sum(10, 20);
	}
	
	

}
