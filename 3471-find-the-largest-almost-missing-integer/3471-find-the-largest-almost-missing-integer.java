 class Solution {
  public int largestInteger(int[] nums, int k){

        int[] count = new int[51];

        // Check every subarray
        for (int i = 0; i <= nums.length - k; i++) {

            for (int j = i; j < i + k; j++) {

                int num = nums[j];

                // Check if num appeared earlier in this subarray
                boolean alreadySeen = false;

                for (int x = i; x < j; x++) {
                    if (nums[x] == num) {
                        alreadySeen = true;
                        break;
                    }
                }

                // Count the subarray only once
                if (!alreadySeen) {
                    count[num]++;
                }
            }
        }

        // Find largest number with count = 1
        int answer = -1;

        for (int i = 0; i <= 50; i++) {
            if (count[i] == 1) {
                answer = i;
            }
        }

        return answer;
    }
}