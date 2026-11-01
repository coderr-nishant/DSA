class Solution {
    public int solve(int[] cost,int n,int[] dp){
        if(n>=cost.length){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int oneStep=cost[n]+solve(cost,n+1,dp);
        int twoStep=cost[n]+solve(cost,n+2,dp);
        return dp[n]= Math.min(oneStep,twoStep);
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int [cost.length+1];
        Arrays.fill(dp,-1);
        int one= solve(cost,0,dp);
        int two=solve(cost,1,dp);
        return Math.min(one,two);
    }
}