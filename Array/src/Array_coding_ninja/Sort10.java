package Array_coding_ninja;

import java.util.Arrays;

public class Sort10 {

	public static int[] pushZeroToEnd(int arr[]) {
	
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count++;
			}
		}
		
		while(count<arr.length) {
			arr[count]=0;
			count++;
			
		}
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello BOSS");
		
        int arr[]= {3,0,0,4,7,0,0};		
		
		int[] trr=pushZeroToEnd(arr);
		System.out.println(Arrays.toString(trr));
	}
	
}
