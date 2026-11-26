class Solution {
    public boolean canAliceWin(int n) {
        if(n<=9) return false;
        if(n<=18) return true;
        int i=10,count=1;
        boolean alice=true;
        while(n>=i){
            n=n-i;
            i--;
            if(count==1){
                count=0;
                alice=true;
            }else{
                count=1;alice=false;
            }
        }
        return alice;
    }
}