class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;

        for(int ele : nums){
            rightSum = rightSum + ele;
        }
        int leftSum = 0;

        for(int i =0; i< nums.length;i++){
            leftSum = leftSum + nums[i];

            if(leftSum == rightSum){
                return i;
            }

        rightSum = rightSum - nums[i];
        }

        return -1;
    }
}