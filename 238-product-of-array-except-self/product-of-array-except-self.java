class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        boolean b=false;
        int product=1,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                product=product*nums[i];
            }else{
                b=true;
                j++;
            }
        }
        if(j==nums.length||j>=2){
         for(int i=0;i<nums.length;i++){
            arr[i]=0;
        }
        return arr;
        }
        if(b){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    arr[i]=product;
                }else{
                    arr[i]=0;
                }
            }
            return arr;
        }
        for(int i=0;i<nums.length;i++){
            arr[i]=product/nums[i];
        }
        return arr;
    }
}