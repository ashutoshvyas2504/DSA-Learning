class Solution {
    public int climbStairs(int n) {
        // if(n == 0 || n == 1){
        //     return 1;
        // }

        // return climbStairs(n - 1) + climbStairs(n - 2);
        if (n == 0 || n == 1) {
            return 1;
        
        }
        int first = 1;
        int second = 2;
        
        for (int i = 1; i < n; i++) {
           int next = first + second;
            first = second;
            second = next;
        }
        return first;
    }
}