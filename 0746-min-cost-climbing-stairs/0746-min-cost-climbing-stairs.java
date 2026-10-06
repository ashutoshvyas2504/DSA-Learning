class Solution {
    // public int minCostClimbingStairs(int[] cost) {
    //     int n = cost.length;
    //     return solve(cost, n);

    // }

    // public int solve(int[] cost, int n) {
    //     if (n <= 1)
    //         return 0;

    //         int oneStep = cost[n - 1] + solve(cost, n - 1);
    //         int doubleStep = cost[n - 2] + solve(cost, n - 2);
    //         return Math.min(oneStep, doubleStep);
    //     }
    // }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n + 1];
        
        // Fill new dp Array with -1
        // Arrays.fill(dp , -1);

        for( int i = 0; i <= n ; i++){
            dp[i] = -1; 
        }

        return solve(cost, n, dp);

    }

    public int solve(int[] cost, int n, int[] dp) {
        if (n <= 1) return 0;
            
         if (dp[n] != -1) return dp[n];
          
          int oneStep = cost[n - 1] + solve(cost , n - 1 , dp); 
          int doubleStep = cost[n - 2] + solve( cost , n - 2 , dp);

           dp [n] = Math.min(oneStep, doubleStep);

          return dp[n];
    }
}
