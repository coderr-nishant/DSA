class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1,largest=1;
        if(nums.length==1){
            return 1;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                count=count+1;
            }else{
                largest=Math.max(largest,count);
                count=1;
            }
        }
        largest=Math.max(largest,count);
        return largest;
    }
}