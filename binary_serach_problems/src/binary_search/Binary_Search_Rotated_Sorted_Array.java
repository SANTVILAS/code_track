package binary_search;

public class Binary_Search_Rotated_Sorted_Array {

	public static int getPivot(int arr[],int n) {
		//int n= arr.length;
		int s= 0;
		int e=n-1;
		int mid=s + (e-s)/2;
		
		while(s<=e) {
			if(arr[mid]>=arr[0]) {
				s=mid+1;
			}else {
				e=mid;
			}
			
			mid =s + (e-s)/2; 
		}
		
		return s;
	}
	
	public static int binarySearch(int arr[],int s,int e,int k) {
		int  start = s;
		int end = arr.length - 1;
		 int mid = (start + end) / 2;
		while (start <= end) {

			

			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] < k) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return -1;

	}
	
	public static int findPosition(int arr[],int n,int k) {
	   //   n=arr.length;
	 //     k=2;
          int pivot = getPivot(arr,n);
		
		if(arr[pivot]<=k && k<=arr[n-1]) {
			//binary search on second line
			return binarySearch(arr,pivot,n-1,k);
		}else {
			//binary search on first line
			return binarySearch(arr,0,pivot-1,k);
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {7,9,3,2,1};
		
		int serachElement = findPosition(arr,5,2);
		System.out.println(serachElement);
		
		
	}
	
}
