package binary_search;

public class First_And_Last_Occurence_Of_Num {
    public static int[] findPositions(int[] nums, int target) {
        int firstOccurrence = -1;
        int lastOccurrence = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }

      return new int[]{firstOccurrence, lastOccurrence};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4, 4, 5};
        int target = 4;

        int[] positions = findPositions(nums, target);

        System.out.println("First occurrence: " + positions[0]);
        System.out.println("Last occurrence: " + positions[1]);
    }
}
