class Solution {
    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        // Normal Binary Search
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
           }  else {
            end = mid - 1;
           }
        }
        return start; // returning start bcz if element is not present in the array
    }
}