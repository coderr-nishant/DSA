class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3){
            return -1;
        }
        int max=0,min=101;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int num=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && nums[i]!=min){
                num=nums[i];
                break;
            }
        }
        return num;
    }
}