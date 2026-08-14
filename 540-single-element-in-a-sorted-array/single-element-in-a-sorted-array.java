class Solution {
    public int singleNonDuplicate(int[] nums) {
       if(nums.length==1){
        return nums[0];
       }
        int low=0,high=nums.length-1;
         int mid=low+(high-low)/2;
        while(low<=high){
             mid=low+(high-low)/2;
            if(mid%2==0){
                if(mid-1>=0&&nums[mid-1]==nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                    if(mid+1==nums.length||nums[mid+1]!=nums[mid]){
                         return nums[mid];
                    }
            }
            }else{
                if(mid-1>=0&&nums[mid-1]==nums[mid]){
                    low=mid+1;
                }else{
                    high=mid-1;
                    if(mid+1==nums.length||nums[mid+1]!=nums[mid]){
                         return nums[mid];
                    }
                }
            }
        }
       return -1;
    }
}