package binary_search;

public class Binary_Search_Pivote_Element {
	public static int peakElement(int arr[]) {
		
		if(arr.length==1) {
			return arr[0];
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[i+1] && arr[i-1]<arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
	     int arr[] = {1,2,3,4,5,6,7,8,5};
	     int peakElement= peakElement(arr);	
		System.out.println(peakElement);
	}

}
