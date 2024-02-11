package constructor_ref;

import java.net.InterfaceAddress;

interface interf3{
	public Sample2 get(String s);
}

class Sample2{
	public String s;
	Sample2(String s){
		this.s=s;
	}
	public void info() {
	System.out.println("Info method");	
	}
}
public class Test3 {
	
	public static void main(String[] args) {
		
		//Method ref
		interf3 i = s->new Sample2(s);
		i.get("sant");
		
		//Cons Ref
		interf3 i1=Sample2::new;
		i1.get("vilas").info();;
		
		
	}

}
