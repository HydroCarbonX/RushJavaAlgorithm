package org.hydrocarbonx.rush.javaalgorithm;

public class _35 {

    public static void main(String[] args) {
        var solution = new _35();

        solution.searchInsert(new int[]{1, 3, 5, 6}, 5);
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;

        while (left <= right) {
            middle = (left + right) >> 1;
            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else if (target > nums[middle]) {
                left = middle + 1;
            }
        }
        return left;
    }
}
