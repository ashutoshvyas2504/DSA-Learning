class Solution {
    public int removeDuplicates(int[] nums) {
        int duplicate = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[duplicate]) {
                duplicate++;
            nums[duplicate] = nums[i];
            }
        }
        return duplicate + 1;
    }
}