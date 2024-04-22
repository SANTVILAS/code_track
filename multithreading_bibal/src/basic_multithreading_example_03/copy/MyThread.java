package basic_multithreading_example_03.copy;

public class MyThread extends Thread {

	public void run() {
     System.out.println("Run method");
	}

	public void start() {
		super.start();
     System.out.println("Start method");
	}

}
