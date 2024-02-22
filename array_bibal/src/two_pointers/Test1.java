package two_pointers;

public class Test1 {

	public static void reverseArray(int arr[]) {

		int i = 0;
		int j = arr.length-1;

		while(i<=j) {
			 int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				i++;
				j--;
			
			}
	
		 System.out.println();
		for(int x : arr) {
			System.out.print(x+" ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		
		reverseArray(arr);
		
	}

}
