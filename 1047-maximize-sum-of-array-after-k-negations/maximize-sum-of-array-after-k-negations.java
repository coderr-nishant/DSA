class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        if(nums[0]>=0){
            while(k!=0){
                nums[0]=nums[0]*-1;
                k--;
            }
            for(int i:nums){
                sum=sum+i;
            }
        }else{
            int i=0;
            while(k!=0){
                nums[i]=nums[i]*-1;
                if(i+1!=nums.length&&nums[i+1]<=0){
                    i++;
                }else if(i+1!=nums.length&&nums[i+1]<nums[i]){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
                k--;
            }
            for(int j:nums){
                sum=sum+j;
            }
        }
        return sum;
    }
}