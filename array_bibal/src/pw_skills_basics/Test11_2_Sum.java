package pw_skills_basics;

public class Test11_2_Sum {

	public static int[] twoSum(int[] nums, int target) {

		int brr[] = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					brr[0] = i;
					brr[1] = j;
				}
			}
		}

		return brr;

	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 11, 15 };
		int target = 9;
		int ans[] = twoSum(arr, 9);
		for (int x : ans) {
			System.out.print(x + " ");
		}
	}

}
