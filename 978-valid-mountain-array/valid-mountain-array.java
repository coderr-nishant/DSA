class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int i,count=Integer.MIN_VALUE,nis=0;
        for( i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                count=1;
            }else{
                break;
            }
            nis++;
        }
        if(count==1){
            for(int n=i;n<arr.length;n++){
                if(arr[n-1]>arr[n]){
                    count=0;
                }else{
                    break;
                }
                nis++;
            }
        }
        if(nis==arr.length-1&&count==0)
        return true;
        return false;
    }
}