class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
                int sum=nums[i];
                int n=0;
                while(sum>0){
                    int r=sum%10;
                    n=n+r;
                    sum=sum/10;
                }
                if(i==n){
                return i;
            
                }
        }
            return -1;
    }
}