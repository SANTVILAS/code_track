package pw_skills_Arrays;

class Solution {
	public int[] twoSum(int[] numbers, int target) {

		int i = 0;
		int j = numbers.length - 1;

		int brr[] = new int[2];

		while (i < j) {
			int sum = numbers[i] + numbers[j];
			if (sum == target) {
				brr[0] = i + 1;
				brr[1] = j + 1;
			} else if (sum < target) {
				i++;
			} else {
				j--;
			}

		}
		return brr;
	}

}