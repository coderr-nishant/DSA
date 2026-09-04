class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length==1){
            return 0;
        }
        int maximum=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;
        int max[]=new int[nums.length];
        int min[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maximum){
                maximum=nums[i];
            }
            max[i]=maximum;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<minimum){
                minimum=nums[i];
            }
            min[i]=minimum;
        }
        for(int i=0;i<nums.length;i++){
            if(max[i]-min[i]<=k){
                return i;
            }
        }
        return -1;
    }
}