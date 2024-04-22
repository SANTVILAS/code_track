package mutithreading_enhancement.multiThreading_04ReentrantImpl;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
   ReentrantLock l=new ReentrantLock();
	public void wish(String name) {
		l.lock();
		for(int i=0;i<10;i++) {
			System.out.println("Good morning ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
		l.unlock();
	}
	
	
	
}
class MyThread extends Thread{
	
	Display d;
	String name;
	
	
	MyThread(Display d,String name) {
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.wish(name);
	}
	
}
