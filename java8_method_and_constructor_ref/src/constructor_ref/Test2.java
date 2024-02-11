package constructor_ref;

interface interff{
	public Sample1 m1();
}

class Sample1{
	Sample1(){
		System.out.println("Sample class constructor");
	}
	
	public void info() {
		System.out.println("Info method");
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		//with lamda expression
		
		interff i=()->new Sample1();
		i.m1();
		
		//withj Constructo referece
		interff f = Sample1::new;
		i.m1().info();
		
		
	}
	
}
