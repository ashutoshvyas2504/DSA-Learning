class Solution {
    // DP Memoization
    //     public int tribonacci(int n) {
    //         int dp[] = new int[n + 1];

    //         return solve(n, dp);
    //     }

    //     public int solve(int n, int[] dp) {
    //         if (n == 0 || n == 1) return n; 
    //         if(n == 2) return 1;
    //         if (dp[n] != 0) return dp[n];

    //         dp[n] = solve(n - 1, dp) + solve(n - 2, dp) + solve(n - 3, dp);
    //         return dp[n];
    //     }
    // }

    // DP Tabulation
    public int tribonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
           return dp[n];
    }
}