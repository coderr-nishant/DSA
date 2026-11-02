class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int mid=nums[len/2];
        int steps=0;
        for(int i=0;i<len;i++){
            steps+=(Math.abs(mid-nums[i]));
        }
        return steps;
        
    }
}