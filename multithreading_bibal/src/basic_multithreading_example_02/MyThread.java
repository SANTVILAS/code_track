package basic_multithreading_example_02;

public class MyThread extends Thread {

	public void run() {
     System.out.println("Run method");
	}

	public void start() {
     System.out.println("Start method");
	}

}
