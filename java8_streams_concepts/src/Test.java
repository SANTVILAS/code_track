
class Test {
	private static Test a = null;
	
	
	private Test(){
	    this.a =a;
  }

	
	public static Test m1() {
		if(a==null){
			a = new Test();
	     }else
		  return a;
		
	}
	 
	
}
