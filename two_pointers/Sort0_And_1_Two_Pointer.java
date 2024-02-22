package two_pointers;

public class Sort0_And_1_Two_Pointer {

	public static void sort0And1_Two_pointers(int arr[]) {
		int i = 0;
		int j = arr.length-1;
       
		while(i<j) {
			if(arr[i]==0) {
				i++;
			}else if(arr[j]==1) {
				j--;
			}
			
			else if(arr[i]!=0 && arr[j]!=1) {
				arr[i]=0;
				arr[j]=1;
				i++;
				j--;
			}
		}
		for(int elem : arr) {
			System.out.print(elem+" ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 };
		sort0And1_Two_pointers(arr);

	}

}
