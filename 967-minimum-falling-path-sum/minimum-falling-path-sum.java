class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[][]=new int [m][n];
        int min=Integer.MIN_VALUE;
        for(int j=0;j<n;j++){
            dp[0][j]=matrix[0][j];
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int up=matrix[i][j]+dp[i-1][j];
                int left_dig=Integer.MAX_VALUE;
                if(j>0){
                    left_dig=matrix[i][j]+dp[i-1][j-1];
                }
                int right_dig=Integer.MAX_VALUE;
                if(j<n-1){
                    right_dig=matrix[i][j]+dp[i-1][j+1];
                }
                dp[i][j]=Math.min(up,Math.min(left_dig,right_dig));
            }
        }
        int minimum=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            minimum=Math.min(minimum,dp[m-1][j]);
        }
        return minimum;
    }
}