class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0,j=nums.length-1,k=nums.length-1;
        int ans[]=new int[nums.length];
        while(i<=j){
            if((nums[i]*nums[i])<(nums[j]*nums[j])){
                ans[k]=nums[j]*nums[j];
                j--;
            }else{
                ans[k]=nums[i]*nums[i];
                i++;
            }
            k--;
        }
        return ans;
    }
}