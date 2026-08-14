class Solution {
    public int findPeakElement(int[] nums) {
         int low=0,high=nums.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(low==high){
                return mid;
            }
            if(mid==nums.length-1&&nums[mid-1]>nums[mid]){
                return (mid-1);
            }
            else if(mid-1>=0&&mid+1<nums.length&&nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return -1;
    }
}