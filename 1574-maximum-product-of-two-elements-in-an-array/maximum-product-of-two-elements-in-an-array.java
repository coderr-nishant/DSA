class Solution {
    public int maxProduct(int[] nums) {
        int largest=nums[0];
        int seclargest=-1;
        for(int i=1;i<nums.length;i++){
            if(largest<=nums[i]){
                seclargest=largest;
                largest=nums[i];
            }else if(nums[i]>seclargest){
                seclargest=nums[i];
            }
        }
        return((largest-1)*(seclargest-1));
    }
}