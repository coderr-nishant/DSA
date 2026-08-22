class Solution {
    public boolean checkDivisibility(int n) {
        int i=n,j=n;
        int sum=0,product=1;
        while(i>0){
            int r=i%10;
            sum=sum+r;
            i=i/10;
        }
         while(j!=0){
            int r=j%10;
            product=product*r;
            j=j/10;
        }
        if(n%(sum+product)==0)
        return true;
        return false;
    }
}