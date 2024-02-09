package java8_practice_functional_interface;

interface  Interf{
	int squareit(int n);
}




public class Square_Of_Number {

	public static void main(String[] args) {
		
		Interf i = n-> n * n;
		System.out.println("The square 5 of "+i.squareit(5));
	}
	
}
