package pw_skills_Arrays;

public class Arrays_Shallow_copy {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };

		for (int element : arr) {
			System.out.println(element + " ");
		}
		
		System.out.println("================================");
		
		int brr[] = arr;  //shallow copy
		brr[0] = 70;
		System.out.println(arr[0]);
		for(int i=0;i<brr.length;i++) {
			System.out.print(brr[i]+" ");
		}

	}

}
