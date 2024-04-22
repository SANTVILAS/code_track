package multithreading_concept_and_coding;

public class MyRunnable implements Runnable{
	MinitorLockExample obj ;
	
	
	
	public MyRunnable(MinitorLockExample obj) {
		super();
		this.obj = obj;
	}



	@Override
	public void run() {
		
		obj.task1();
		
	}
	

}
