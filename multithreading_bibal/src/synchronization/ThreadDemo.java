package synchronization;

public class ThreadDemo {
	public static void main(String[] args) {
       
		Display d1 = new Display();
		Display d2 = new Display();
		
		
		MyThread t1 = new MyThread(d1, "santvilas");
		MyThread t2 = new MyThread(d2, "Monu");
		t1.start();
		t2.start();
		
		
	}
}
