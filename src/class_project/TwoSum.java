package class_project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numIndexMap.containsKey(complement)) {
                return new int[]{numIndexMap.get(complement), i};
            }

            numIndexMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = findTwoSum(nums1, target1);
        System.out.println("Example 1: " + Arrays.toString(result1));

        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = findTwoSum(nums2, target2);
        System.out.println("Example 2: " + Arrays.toString(result2));

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = findTwoSum(nums3, target3);
        System.out.println("Example 3: " + Arrays.toString(result3));
    }
}
