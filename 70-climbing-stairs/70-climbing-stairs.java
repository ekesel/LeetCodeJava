class Solution {
    static int dp[] = new int[46];
    public int climbStairs(int n) {
        Arrays.fill(dp,-1);
        return climb(n);
    }
    public static int climb(int n)
    {
        if( n == 1 || n == 2 || n == 3)
            return n;
        if(dp[n] !=  -1)
            return dp[n];
        return dp[n] = climb(n-1)+climb(n-2);
    }
}