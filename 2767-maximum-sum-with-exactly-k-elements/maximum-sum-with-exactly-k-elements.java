class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=nums[0];
        for(int i:nums){
            max=Math.max(max,i);
        }
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+(max+i);
        }
        return sum;
    }
}