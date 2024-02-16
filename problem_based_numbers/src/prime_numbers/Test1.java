package prime_numbers;

public class Test1 {

	public static int isPrime(int N){
	      if(N<=1)
	          return 0;
	      
	      for(int i=2;i*i<=N;i++)
	      if(N%i==0 )return 0;
	      
	       return 1;
	      
	    }
	
	
	public static void main(String[] args) {
		System.out.println(isPrime(9));
		System.out.println(isPrime(7));
	}
	
}
