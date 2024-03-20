package Array2D_pwc;

import java.util.Scanner;

public class Test04_Store_Marks_And_RollNo {
	public static void main(String[] args) {

		int arr[][] = new int[4][2];
		Scanner s = new Scanner(System.in);
		
		   for(int i=0;i<4;i++) {
		    	for(int j=0;j<2;j++) {
		    		arr[i][j]=s.nextInt();
		    	}
		    	System.out.println();
		    }
		
	    for(int i=0;i<4;i++) {
	    	for(int j=0;j<2;j++) {
	    		System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    
	 
	    
		
	}
}
