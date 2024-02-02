package singleton_design_pattern;

class B {

	static B b = null;
   
	static {
		b=new B();
	}
	private B() {
		
	}
	static B getRef() {
		return b;
	}
	
}
public class Test_Singleton_SecondWay {
	public static void main(String[] args) {
        System.out.println(B.getRef());
        System.out.println(B.getRef());
        System.out.println(B.getRef());
	}

}
