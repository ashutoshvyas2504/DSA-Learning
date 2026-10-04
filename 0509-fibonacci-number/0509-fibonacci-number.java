class Solution {
    // DP Memoization
    // public int fib(int n) {
    //     int[] dp = new int[n+1];
    //     return solve(n, dp);
    // }

    // public int solve(int n, int[] dp){
    //     if(n==1 || n==0) return n;
    //     if(dp[n] != 0) return dp[n];
    //     dp[n] = solve(n-1 , dp ) + solve(n-2 , dp);
    //     return dp[n];
   // }
// }

// Dp Tabulation 
public int fib(int n) {
    
    if(n == 1 || n == 0) return n;
    int [] dp = new int [n+1];
    dp[0] = 0;
    dp[1] = 1;
    
    for(int i = 2; i <=n; i++){
        dp[i] = dp[i-1] + dp[i-2];
        // dp [n] = dp[i];
    }
     return dp[n];
}
}