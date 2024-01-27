package binary_search;

public class Binary_Serach_Pivote_Element {
	
	public static int pivoteElement(int arr[]) {
		int n= arr.length;
		int s= 0;
		int e=n-1;
		int mid=s + (e-s)/2;
		
		while(s<=e) {
			if(arr[mid]>=arr[0]) {
				s=mid+1;
			}else {
				e=mid-1;
			}
			
			mid =s + (e-s)/2; 
		}
		
		return s;
	}
	
	public static void main(String[] args) {
        int arr[] = {7,9,1,2,3};
		int n = pivoteElement(arr);
		System.out.println(n);
		}
}
