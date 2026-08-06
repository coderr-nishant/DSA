class Solution {
    public void rotate(int[] nums, int k) {
      int n=nums.length;
      k=k%n;
      // Reverse entire array
     for(int i=0,j=n-1;i<j;i++,j--){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
     }
     //Reverse first k-1 array
     for(int i=0,j=k-1;i<j;i++,j--){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
     }
     //Reverse after first k-1 array
      for(int i=k,j=n-1;i<j;i++,j--){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
     }
    }
}