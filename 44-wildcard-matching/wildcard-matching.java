class Solution {
    public boolean solve(int i,int j,String s, String p,Boolean [][] dp){
        //Recursion

        // if(i==-1&&j==-1){
        //     return true;
        // }else if (i>=0&&j==-1){
        //     return false;
        // }
        // if(i==-1){
        //     for(int k=0;k<=j;k++){
        //         if(p.charAt(k)!='*'){
        //             return false;
        //         }
        //     }
        //     return true;
        // }
        // if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?'){
        //     return solve(i-1,j-1,s,p);
        // }
        // else if(p.charAt(j)=='*'){
        //     return solve(i,j-1,s,p)||solve(i-1,j,s,p);
        // }
        // return false;


        //Memoization(top-down approach)
        

        if(i==-1&&j==-1){
            return true;
        }else if (i>=0&&j==-1){
            return false;
        }
        if(i==-1){
            for(int k=0;k<=j;k++){
                if(p.charAt(k)!='*'){
                    return false;
                }
            }
            return true;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?'){
            return dp[i][j]=solve(i-1,j-1,s,p,dp);
        }
        else if(p.charAt(j)=='*'){
            return dp[i][j]= solve(i,j-1,s,p,dp)||solve(i-1,j,s,p,dp);
        }
        return dp[i][j]=false;
    }
    public boolean isMatch(String s, String p) {
        int i=s.length()-1;
        int j=p.length()-1;
        Boolean dp[][]=new Boolean[i+1][j+1];
        return solve(i,j,s,p,dp);
    }
}