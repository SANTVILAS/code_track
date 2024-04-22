package multithreading_concept_and_coding;

public class MonitorLockMainMethod {

	public static void main(String[] args) {
		MinitorLockExample obj = new MinitorLockExample();
		
		
		 MyRunnable r =new MyRunnable(obj); 
		 Thread t1 = new Thread(r); 
	///	 t.start();
		 
		
//		   Thread t1=new Thread(()->{
//			  obj.task1(); 
//		   });
		   
		   Thread t2=new Thread(()->{
				  obj.task2(); 
			   });
		   
		   Thread t3=new Thread(()->{
				  obj.task3(); 
			   });
		   
		   t1.start();
		   t2.start();
		   t3.start();
		
	}
}
