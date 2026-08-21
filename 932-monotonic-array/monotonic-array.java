class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1){
            return true;
        }
        boolean increasing=true;
        boolean decreasing=true;
        for(int i=0;i<nums.length&&i+1!=nums.length;i++){
            if(nums[i]<nums[i+1]){
                decreasing=false;
            }
            if(nums[i]>nums[i+1]){
                increasing=false;
            }
        }
        return increasing||decreasing;
    }
}