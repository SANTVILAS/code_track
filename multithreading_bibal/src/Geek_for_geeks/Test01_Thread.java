package Geek_for_geeks;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" i ="+i);;
		}
	}
	
}

public class Test01_Thread {
	public static void main(String[] args) {
          MyThread thread = new MyThread();
          thread.start();
          for(int i=0;i<10;i++) {
  			System.out.println(Thread.currentThread().getName()+" i ="+i);
  		}
		
	}
}
