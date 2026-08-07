class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength=Integer.MAX_VALUE;
        int r=0,l=0,sum=0;
        while(r<nums.length){
            sum=sum+nums[r];
            while(sum>=target){
                minLength=Math.min(minLength,r-l+1);
                sum=sum-nums[l];
                l++;
            }
            r++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}