package rotate_an_array;

// o/p==> 70 60 50 40 30 10 20
public class Test1 {

	public static void reverse(int arr[], int i, int j) {
         while(i<=j) {
        	 int temp = arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
             
         }
         for(int x : arr) {
         	System.out.print(" "+x+" ");
         }
	}
	
	public static void rotate(int arr[], int k) {
		int n = arr.length;
		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
		
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int k=3;
		rotate(arr,k);
		
	}
}
