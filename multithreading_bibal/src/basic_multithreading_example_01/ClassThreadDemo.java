package basic_multithreading_example_01;

public class ClassThreadDemo {
	public static void main(String[] args) {

	MyThread thread  = new MyThread();
	thread.start();
	
	for(int i=0;i<10;i++) {
		System.out.println("Patent thread");
	}
		
	}
}
