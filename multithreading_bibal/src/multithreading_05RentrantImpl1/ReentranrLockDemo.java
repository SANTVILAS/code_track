package multithreading_05RentrantImpl1;

import java.util.concurrent.locks.ReentrantLock;

class Mythread extends Thread{
	static ReentrantLock l=new ReentrantLock();
	
	public Mythread(String name) {
	super(name);
	}
	
	public void run() {
		if(l.tryLock()) {
			System.out.println(Thread.currentThread().getName() +" Got lock and performing safe operation");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l.unlock();
		}else {
			System.out.println(Thread.currentThread().getName()+" Unable to get lock and hence performing Alternative operation");
		}
		
	}
} 


public class ReentranrLockDemo {
public static void main(String[] args) {
	
	Mythread t1=new Mythread("First thread");
	Mythread t2=new Mythread("Second thread");
	t1.start();
	t2.start();
}
}
