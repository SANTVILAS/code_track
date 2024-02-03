package throw_and_throws;

import java.io.IOException;

class A {
	void add() throws Exception{
       concat();
	}

	void concat() throws IOException{
		throw new IOException("My IO Exception");
	}

}

public class Test {
	public static void main(String[] args) throws Exception {
		A a = new A();
		a.add();

	}

}
