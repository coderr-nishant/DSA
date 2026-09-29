class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int low=0,high=nums.length-1;
        int mid=low+(high-low)/2;
        int count=0;
        for(int i=0;i<=high;i++){
            if(nums[i]==nums[mid]){
                count++;
            }
        }
        return count==1;
    }
}