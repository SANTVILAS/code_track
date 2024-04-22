package basic_multithreading_example_03.copy;

public class ThreadDemo {
	public static void main(String[] args) {
        
		MyThread t= new MyThread();
		t.start();
		System.out.println("End");
	}
}
