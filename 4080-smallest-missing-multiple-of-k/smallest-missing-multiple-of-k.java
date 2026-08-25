class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0&&!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
        }
        int n=1;
        for(int j=k;j<=Integer.MAX_VALUE;j=j+k){
            if(!map.containsKey(j)){
                n=j;
                break;
            }
        }
        return n;
    }
}