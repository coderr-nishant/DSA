class Solution {
    public int maxRotateFunction(int[] nums) {
        
        int n=nums.length;
        long sum=0,product=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            product=product+(nums[i]*i);
        }
       long max=product;
        for(int i=nums.length-1;i>=1;i--){
            product=product+sum-(n*nums[i]);
            max=Math.max(max,product);
        }
        return (int)max;
    }
}