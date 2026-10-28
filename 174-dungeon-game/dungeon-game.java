class Solution {
    // public int solve(int r,int c,int[][] dungeon,int[][] dp){
        
        //Recursion

        // int row=dungeon.length;
        // int col=dungeon[0].length;
        // if(row<=r||col<=c)return Integer.MAX_VALUE;
        // if(r==row-1&&c==col-1){
        //     return Math.max(1,1-dungeon[r][c]);
        // }
        // int right=solve(r,c+1,dungeon);
        // int down=solve(r+1,c,dungeon);
        // int finals=Math.min(right,down);

        // return Math.max(1,finals-dungeon[r][c]);

        //Memoization
    //     int row=dungeon.length;
    //     int col=dungeon[0].length;
    //     if(row<=r||col<=c)return Integer.MAX_VALUE;
    //     if(r==row-1&&c==col-1){
    //         return Math.max(1,1-dungeon[r][c]);
    //     }
    //     if(dp[r][c]!=-1){
    //         return dp[r][c];
    //     }

    //     int right=solve(r,c+1,dungeon,dp);
    //     int down=solve(r+1,c,dungeon,dp);
    //     int finals=Math.min(right,down);

    //     return dp[r][c]= Math.max(1,finals-dungeon[r][c]);
    // }
   
    public int calculateMinimumHP(int[][] dungeon) {
        //Recursion
        // return solve(0,0,dungeon);

        //Memoization
        // int m=dungeon.length;
        // int n=dungeon[0].length;
        // int dp[][]=new int[m][n];
        // for(int[] row: dp){
        //     Arrays.fill(row, -1);
        // }
        // return solve(0,0,dungeon,dp);


        //Tabulation
        int m=dungeon.length;
        int n=dungeon[0].length;
        int dp[][]=new int[m][n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1&&j==n-1){
                    dp[i][j]=(dungeon[i][j]>0?1:1-dungeon[i][j]);
                }else{
                    int up=(i+1>=m)?Integer.MAX_VALUE:dp[i+1][j];
                    int down=(j+1>=n)?Integer.MAX_VALUE:dp[i][j+1];
                    int res=Math.min(up,down)-dungeon[i][j];
                    dp[i][j]=res>0?res:1;
                }
            }
        }
        return dp[0][0];
    }
}