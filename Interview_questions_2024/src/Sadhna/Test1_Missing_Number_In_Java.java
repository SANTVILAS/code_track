package Sadhna;

import java.util.Arrays;

//how to get missing number 1 to 9
public class Test1_Missing_Number_In_Java {
	public static void main(String[] args) {
		// approach should be like

		// missingNumber = Sum of all number - sumofNumberPresentIn list

		int n = 9;
		int[] numbers = { 1, 2, 4, 3, 5, 6, 8, 9 };
		int sum = n * (n + 1) / 2;
		System.out.println("Sumn of n number "+sum);

		int sumOfNumberPresentInArray = 0;
//		for (int i = 1; i<arr.length; i++) {
//			sumOfNumberPresentInArray = sumOfNumberPresentInArray + i;
//		}
		
		int sumOfNumberPresentInArray1 = Arrays.stream(numbers).sum();
        System.out.println(sumOfNumberPresentInArray1);
		int missingNumber=sum - sumOfNumberPresentInArray1;
		
		
		System.out.println(missingNumber);
	}
}
