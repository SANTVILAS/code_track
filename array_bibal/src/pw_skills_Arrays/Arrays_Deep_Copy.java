package pw_skills_Arrays;

import java.util.Arrays;

public class Arrays_Deep_Copy {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };

		for (int element : arr) {
			System.out.println(element + " ");
		}
		
		System.out.println("==========================================");
		System.out.println();
		
		System.out.println("===========================================");
		int brr[] = Arrays.copyOf(arr, arr.length);
		brr[0] = 70;
		System.out.println("copied array values ");
		for (int element : brr) {
			System.out.print(element + " ");
		}
		
		System.out.println("arr values not effected here ");
		System.out.println(arr[0]);
		
		System.out.println("==============Another method===================");
		
		int crr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			crr[i] = arr[i];
		}
		crr[0] = 100;
		for (int element : crr) {
			System.out.print(element + " ");
		}
		
	}

}
