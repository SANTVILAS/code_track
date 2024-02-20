package pw_skills_array_basics;

public class Test9_Max_Element_Array {

	public static void main(String[] args) {

		int arr[] = { 34, 55, 66, 35, 74, 95, 23, 43 };

		// //method -1

		int max_Element = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max_Element < arr[i]) {
				max_Element = arr[i];
			}
		}
		System.out.println(max_Element);

		System.out.println("===================================");

//		//method -2

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);

		System.out.println("=====================================");
		// method -3
	
		
		int mx = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			mx=Math.max(mx, arr[i]);
		}
		
	   System.out.println(mx);
         
	}

}
