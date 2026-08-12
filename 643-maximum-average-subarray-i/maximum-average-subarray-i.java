class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int i=0,sum=0;
        while(i<k){
            sum+=nums[i];
            i++;
        }
        if(sum>max){
            max=sum;
        }
        for(int j=k,n=0;j<nums.length;j++,n++){
            sum=sum+nums[j]-nums[n];
            if(sum>max){
                max=sum;
            }
        }
        return max/(k*1.0);
    }
}