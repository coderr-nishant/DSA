class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int i=0,sum=0;
        for(int j=k-1;j<nums.length;j++){
            int p=i;
            while(i<=j){
                sum+=nums[i];
                i++;
            }

            if(sum>max){
                max=sum;
            }
            sum=0;
            i=p+1;
        }
        return max/(k*1.0);
    }
}