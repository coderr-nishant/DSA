class Solution {
    public int dominantIndex(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],i);
        // }
        int arr[]=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[i];
        }

        Arrays.sort(nums);
        
        if(nums[nums.length-1]>=2*nums[nums.length-2]){
            // return map.get(nums[nums.length-1]);
            for(int i=0;i<nums.length;i++){
                if(arr[i]==nums[nums.length-1]){
                    return i;
                }
            }
        }
        return -1;
    }
}