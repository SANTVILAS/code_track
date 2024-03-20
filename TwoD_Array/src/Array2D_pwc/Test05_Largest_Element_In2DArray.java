package Array2D_pwc;

public class Test05_Largest_Element_In2DArray {

	public static void main(String[] args) {
	
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
		  int mx=Integer.MIN_VALUE;
		
		      for(int i=0;i<3;i++) {
		    	for(int j=0;j<3;j++) {
		    		
		    	mx=Math.max(mx, arr[i][j]);
                 sum += arr[i][j];
		    		
		    	}
		    	
		    }
		      System.out.println(mx);
		      System.out.println(sum);
		
	}

}
