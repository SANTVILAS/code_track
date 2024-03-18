

import java.util.ArrayList;
import java.util.HashMap;

public class Highest_occurigNumber_3 {
    public static int maxFrequencyNumber(int[] arr){ 
		int max = 0;
        // int count=0;
        int ans = -1;
        HashMap<Integer,Integer> seen=new HashMap<>();
        
        // if(seen.isEmpty()){
        //     return -1;
        // }
        
      //  int arr[]=new int[];
        for(int i=0;i<arr.length;i++)
        {
            if(seen.containsKey(arr[i])){
                seen.put(arr[i], seen.get(arr[i]) + 1);
            }
            else
                seen.put(arr[i], 1);
        }
        
        for(int i : arr)
        {
            if(seen.get(i) > max)
            {
                max = seen.get(i);
                ans = i;
            }
        }
        
        
        return ans;
    }

	
	
	
	public static void main(String[] args) {
		
        int arr[] = { 1, 2, 5, 3, 2, 1, 6, 4, 3 ,2,2,2};
		int output = maxFrequencyNumber(arr);
		System.out.println(output);
	}
	
	
	


}