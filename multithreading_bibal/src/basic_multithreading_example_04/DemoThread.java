package basic_multithreading_example_04;

public class DemoThread {
public static void main(String[] args) {
	
	MyRunnable r = new MyRunnable();
    Thread t = new Thread(r);
	 t.start();
	 
	 for (int i = 0; i < 10; i++) {
			System.out.println("this is parent thread");

		}
}
	 
}
