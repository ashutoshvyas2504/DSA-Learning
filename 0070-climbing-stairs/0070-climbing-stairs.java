class Solution {
    // Dp Memoization
    // public int climbStairs(int n) {
    //     if (n == 0 || n == 1)return 1;
    //      int[] dp = new int[n+1];
    //     return solve(n , dp);
    // }

    // public int solve(int n , int [] dp) {
    //     if (n == 0 || n == 1) return 1;
    //     if(dp[n] != 0) return dp[n];
    //      dp[n] = solve(n - 1 , dp) + solve(n - 2 , dp);
    //     return dp[n];
    //     }
    // }

    // DP Tabulation
    public int climbStairs(int n) {
        if (n == 0 || n == 1)
            return n;
      
      int dp[] = new int [n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}