class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length==1){
            return 0;
        }
        int maximum=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;
        int min[]=new int[nums.length];
        int max[]=new int[nums.length];
        //largest element at each index position
        for(int i=0;i<nums.length;i++){
            if(maximum<nums[i]){
                maximum=nums[i];
            }
            max[i]=maximum;
        }
        //Smallest element at each index position
        for(int i=nums.length-1;i>=0;i--){
            if(minimum>nums[i]){
                minimum=nums[i];
            }
            min[i]=minimum;
        }
        //Difference
        for(int i=0;i<nums.length;i++){
            if(max[i]-min[i]<=k){
                return i;
            }
        }
        return -1;
    }
}