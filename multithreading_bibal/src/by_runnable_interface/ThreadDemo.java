package by_runnable_interface;

public class ThreadDemo {

	//r is tgrager runnable
	
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
