class Solution {
    public boolean judgeSquareSum(int c) {
        int num=(int)Math.sqrt(c);
        int arr[]=new int[num+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        int i=0,j=arr.length-1;
        while(i<=j){
            long sum=(long)(arr[i]*arr[i])+(arr[j]*arr[j]);
            if(sum==c){
                return true;
            }else if(sum<c){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}