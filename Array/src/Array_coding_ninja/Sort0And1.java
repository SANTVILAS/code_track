package Array_coding_ninja;



import java.util.Arrays;

public class Sort0And1 {

	

    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
        }
    
       while(count<arr.length){
            arr[count] =0;
            count++;
        }
    } 
	
	public static void main(String[] args) {
		
	//	int arr[]= {1,0,1,1,0,0,1};
		int arr[]= {3,0,2,5,0,0,3};
	//	sortZeroandOne(arr);
		pushZerosAtEnd(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
}