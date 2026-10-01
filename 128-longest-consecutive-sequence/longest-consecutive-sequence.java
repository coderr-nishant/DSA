class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int longest=1;
        int count=1;
        for(int i:set){
            if(!set.contains(i-1)){
                int num=i+1;
                while(set.contains(num)){
                    count++;
                    num=num+1;
                }
                longest=Math.max(longest,count);
                count=1;
            }
        }
        return longest;
    }
}