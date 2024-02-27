package streams_gfg;

import java.util.Arrays;

public class Test1_Jbdl_68 {

	public static void main(String[] args) {
        
		int arr[] = {1,3,5,7,8,9};
		
		int sum=Arrays.stream(arr).sum();
		System.out.println(sum);
	}

}
