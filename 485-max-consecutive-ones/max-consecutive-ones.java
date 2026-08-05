class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=0,h=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                n=n+1;
            }else{
                if(n>h){
                    h=n;
                }
                n=0;
            }
        } if(n>h){
                    h=n;
                }
        return h;
    }
}