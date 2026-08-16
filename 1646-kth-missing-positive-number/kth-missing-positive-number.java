class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=1,i=0,j=1;
        int arr1[]=new int[k];
        while(i<arr.length){
            if(arr[i]==count){
                i++;
            }else{
                arr1[k-1]=count;
                k--;
                if(k==0){
                    return arr1[0];
                }
            }
            count++;
        }
        while(k!=0){
            arr1[k-1]=arr[arr.length-1]+j;
            j++;
            k--;
        }
        return arr1[0];
    }
}