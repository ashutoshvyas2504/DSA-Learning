class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        //when last digit is not equals to 9
        if (digits[n - 1] != 9) {
            digits[n - 1] = digits[n - 1] + 1;
            return digits;
        }
        //firstly put 0 in last digit 
        digits[n - 1] = 0;
        //then check 2nd digit if it is not equals to 9 
        for (int i = n - 2; i >= 0; i--) {
            if (digits[i]!= 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }
        // make new array of length+1
        int[] ans = new int[n + 1];
        // put 1 at first index 
        ans[0] = 1;
        return ans;
    }
}