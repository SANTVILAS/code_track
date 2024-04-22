package mutithreading_enhancement.multiThreading_04ReentrantImpl;

public class ReentrantLockDemo {
	
	public static void main(String[] args) {
		
		Display d=new Display();
		MyThread t1=new MyThread(d, "Dhoni");
		MyThread t2=new MyThread(d, "yuvraj");
		MyThread t3=new MyThread(d, "virat");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
