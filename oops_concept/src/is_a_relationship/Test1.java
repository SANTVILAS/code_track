package is_a_relationship;

class Aninmal { 
	
	void Animal(){
		System.out.println("Animal cons called");
	}

	void eating() {
		System.out.println("Aninal class");
	}

}

class Dog extends Aninmal {
	Dog(){
		System.out.println("Dog constructor");
	}
	
	void eating() {
		System.out.println("Dog class");
	}
}



public class Test1 {
	
public static void main(String[] args) {
		
		Dog g =new Dog();
		g.eating();
		
		
	}

}
