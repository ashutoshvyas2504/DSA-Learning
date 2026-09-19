class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int currSum = 0;
        int actualSum = n * (n + 1) / 2;

        for (int i = 0; i < n; i++) {
            currSum = currSum + nums[i];
        }

        int ans =  actualSum - currSum;

        return ans;
    }
}