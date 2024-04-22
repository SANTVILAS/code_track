package basic_multithreading_example_05;

public class ThreadDemo {
	
public static void main(String[] args) {
	MyRunnable r=new MyRunnable();
	
	Thread t1=new Thread();
	Thread t2=new Thread(r);
	
	r.run();
	
}
	

}
