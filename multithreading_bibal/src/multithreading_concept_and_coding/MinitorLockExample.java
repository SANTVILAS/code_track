package multithreading_concept_and_coding;

public class MinitorLockExample {

	
	public synchronized void task1() {
	
		try {
			System.out.println("Inside Task1");
			Thread.sleep(5000);
			System.out.println("Task1 Completed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void task2() {
		System.out.println("task 2, Before synchronization");
		
		synchronized (this) {
			System.out.println("Task 2 ,Inside synchronization");
		}
	}
	
	
	public void task3() {
		System.out.println("task 3");
	}
	
}
