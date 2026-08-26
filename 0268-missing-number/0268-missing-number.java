class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = 0;
        int currSum = n * (n + 1) / 2;

        for(int i = 0; i < n; i++){
           actualSum += nums[i];
          
        }
        
      int ans =  currSum - actualSum;
      return ans;
    }
}