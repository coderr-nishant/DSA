class Solution {
    public int alternateDigitSum(int n) {
        int count=0,p=n;
        while(p>0){
            count++;
            p=p/10;
        }
        int sign=1;
        if(count%2==0){
            sign=-1;
        }
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=r*sign;
            n=n/10;
            sign*=-1;
        }
        return sum;
    }
}